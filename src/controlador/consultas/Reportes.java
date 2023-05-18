package controlador.consultas;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Genera los reportes en PDF y realiza todas las consulta a la base de datos
 * necesarias
 *
 * @author Carlos Masabet
 * @since 0.3
 */
public class Reportes extends Conexion_SQL {

    private static Reportes instance;

    private final String pdfGen = "PDF generado en el escritorio, carpeta de Reportes  Inventario";
    private final Font letra = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
    private final String img = "imagenes/reportes/header.jpg";

    private Reportes() {

    }

    /**
     * Metodo singleton, valida si ya existe una instancia de esta clase y la
     * devuelbe, si no existe la crea
     *
     * @return objeto de la clase Reportes
     */
    public static Reportes getInstance() {
        if (instance == null) {
            instance = new Reportes();
        }
        return instance;
    }

    /**
     * Crea las carpeta donde se almacena los reportes
     */
    public static void carpetas() {
        //genera la carperta
        String ruta1 = System.getProperty("user.home") + "/desktop/Reportes Inventario/Departamentos";
        String ruta2 = System.getProperty("user.home") + "/desktop/Reportes Inventario/Perifericos";
        File c = new File(ruta1);
        c.mkdirs();
        File c2 = new File(ruta2);
        c2.mkdirs();
    }

    /**
     * Genera los reportes generales
     */
    public void reporteGeneral() {
        Document doc = new Document();

        Date date = new Date();
        String formato = new SimpleDateFormat("dd-MM-yyyy").format(date);

        carpetas();

        try {

            String ruta = System.getProperty("user.home") + "/desktop/Reportes Inventario";
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/lista_Equipos_" + formato + ".pdf"));
            //ruta + "/desktop/lista_equipos" + formato + ".pdf"

            doc.open();

            //carga el cintillo
            Image header = Image.getInstance(img);
            header.scaleToFit(600, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            doc.add(header);

            Font letra1 = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);

            //carga la fecha
            Paragraph fecha = new Paragraph();
            fecha.setFont(letra1);

            fecha.setAlignment(Chunk.ALIGN_RIGHT);
            fecha.add("Fecha: " + formato);

            doc.add(fecha);

            //carga el titulo
            Paragraph titulo = new Paragraph();
            titulo.setFont(new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD));
            titulo.setAlignment(Chunk.ALIGN_CENTER);
            titulo.add("Control de Inventario de Equipos\n\n");

            doc.add(titulo);

            //tcarga la abla
            PdfPTable tabla = new PdfPTable(5);
            String[] cabezera = {"Departamento", "Usuario", "Marca", "Modelo", "Serial"};
            tabla.setWidthPercentage(100);
            float[] w = {130f, 100f, 100f, 100f, 100f};
            tabla.setWidths(w);

            for (String cabezera1 : cabezera) {
                tabla.addCell(cabezera1);
            }

            try {
                Connection con = getConnection();

                String sql = "select dep.nombre, pc.usuario, ma.Nombre, mo.Nombre, pc.serial from pc_dep as pd inner join pc on pd.pc_id = pc.id inner join marca as ma on pc.Marca = ma.id inner join modelo as mo on pc.Modelo = mo.id inner join departamentos as dep on pd.dep_id = dep.id group by pc.id ";

                PreparedStatement ps = con.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));

                    } while (rs.next());
                    doc.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
            }

            doc.close();
            JOptionPane.showMessageDialog(null, pdfGen);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "PDF no generado/n Error: " + e);

        } catch (IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Genera los reportes filtrados por el departemento
     *
     * @param depa Nombre del departamento del que se va a generar el reporte
     */
    public void reporteDepartamentos(String depa) {
        Document doc = new Document();

        Date date = new Date();
        String formato = new SimpleDateFormat("dd-MM-yyyy").format(date);

        carpetas();

        try {

            String ruta = System.getProperty("user.home") + "/desktop/Reportes Inventario/Departamentos";
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/lista_Equipos_" + depa + "_" + formato + ".pdf"));
            //ruta + "/desktop/lista_equipos" + formato + ".pdf"

            doc.open();

            //carga el cintillo
            Image header = Image.getInstance(img);
            header.scaleToFit(600, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            doc.add(header);

            Font letra2 = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);

            //carga la fecha
            Paragraph fecha = new Paragraph();
            fecha.setFont(letra2);

            fecha.setAlignment(Chunk.ALIGN_RIGHT);
            fecha.add("Fecha: " + formato);

            doc.add(fecha);

            //carga el titulo
            Paragraph titulo = new Paragraph();
            titulo.setFont(new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD));
            titulo.setAlignment(Chunk.ALIGN_CENTER);
            titulo.add("Control de Inventario de Equipos del departamento " + depa + "\n\n");

            doc.add(titulo);

            //tcarga la abla
            PdfPTable tabla = new PdfPTable(4);
            String[] cabezera = {"Usuario", "Marca", "Modelo", "Serial"};
            tabla.setWidthPercentage(100);
            float[] w = {100f, 100f, 100f, 100f};
            tabla.setWidths(w);

            for (String cabezera1 : cabezera) {
                tabla.addCell(cabezera1);
            }

            try {
                Connection con = getConnection();

                String sql = "select pc.usuario, ma.Nombre, mo.Nombre, pc.serial from departamentos as dep inner join pc_dep as pd on pd.dep_id = dep.id inner join pc  on pd.pc_id = pc.id inner join marca as ma on pc.Marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where dep.nombre = ?";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, depa);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));

                    } while (rs.next());
                    doc.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
            }

            doc.close();
            JOptionPane.showMessageDialog(null, pdfGen);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "PDF no generado/n Error: " + e);

        } catch (IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Genera los reportes filtrados por el tipo de perifericos
     *
     * @param peri Nombre del tipo de perriferico del que se va a generar el
     * reporte
     */
    public void reportePerifericos(String peri) {
        Document doc = new Document();

        Date date = new Date();
        String formato = new SimpleDateFormat("dd-MM-yyyy").format(date);

        carpetas();

        try {

            String ruta = System.getProperty("user.home") + "/desktop/Reportes Inventario/Perifericos";
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/lista_" + peri + "_" + formato + ".pdf"));
            //ruta + "/desktop/lista_equipos" + formato + ".pdf"

            doc.open();

            //carga el cintillo
            Image header = Image.getInstance(img);
            header.scaleToFit(600, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            doc.add(header);

            //carga la fecha
            Paragraph fecha = new Paragraph();
            fecha.setFont(letra);

            fecha.setAlignment(Chunk.ALIGN_RIGHT);
            fecha.add("Fecha: " + formato);

            doc.add(fecha);

            //carga el titulo
            Paragraph titulo = new Paragraph();
            titulo.setAlignment(Chunk.ALIGN_CENTER);
            titulo.setFont(new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD));
            titulo.add("Control de Inventario de " + peri + "\n\n");

            doc.add(titulo);

            //tcarga la abla
            PdfPTable tabla = new PdfPTable(3);
            String[] cabezera = {"Usuario", "Serial del PC", "Serial " + peri};
            tabla.setWidthPercentage(100);
            float[] w = {150f, 150f, 150f,};
            tabla.setWidths(w);

            for (String cabezera1 : cabezera) {
                tabla.addCell(cabezera1);
            }

            try {
                Connection con = getConnection();

                String sql = "select pc.usuario, pc.serial, per.serial from pc inner join perifericos as per on pc.id = per.pc inner join lista as lis on per.tipo = lis.idlista where lis.desc = ? order by pc.id";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, peri);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));

                    } while (rs.next());
                    doc.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
            }

            doc.close();
            JOptionPane.showMessageDialog(null, pdfGen);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "PDF no generado/n Error: " + e);

        } catch (IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
