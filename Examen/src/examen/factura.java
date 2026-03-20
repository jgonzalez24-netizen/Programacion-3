package examen;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class factura extends JFrame {

    public factura() {
        setTitle("Factura en Java - NetBeans - ArrayList y POO");
        setSize(750, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // HEADER
        JPanel header = new JPanel();
        header.setBackground(new Color(0, 102, 153));
        header.setBounds(0, 0, 750, 70);
        header.setLayout(null);

        JLabel titulo = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(20, 10, 500, 25);

        JLabel sub = new JLabel("[Sin Base de datos]");
        sub.setForeground(Color.WHITE);
        sub.setBounds(20, 35, 200, 20);

        header.add(titulo);
        header.add(sub);
        add(header);

        // PANEL CLIENTE
        JPanel cliente = new JPanel();
        cliente.setBorder(new TitledBorder("Datos del cliente"));
        cliente.setBounds(20, 80, 700, 100);
        cliente.setLayout(null);

        JLabel lblDoc = new JLabel("Documento:");
        lblDoc.setBounds(10, 20, 100, 20);
        cliente.add(lblDoc);

        JTextField txtDoc = new JTextField();
        txtDoc.setBounds(100, 20, 150, 25);
        cliente.add(txtDoc);

        JLabel lblNom = new JLabel("Nombres:");
        lblNom.setBounds(300, 20, 100, 20);
        cliente.add(lblNom);

        JTextField txtNom = new JTextField();
        txtNom.setBounds(380, 20, 200, 25);
        cliente.add(txtNom);

        JLabel lblDir = new JLabel("Dirección:");
        lblDir.setBounds(10, 55, 100, 20);
        cliente.add(lblDir);

        JTextField txtDir = new JTextField();
        txtDir.setBounds(100, 55, 150, 25);
        cliente.add(txtDir);

        JLabel lblTel = new JLabel("Teléfono:");
        lblTel.setBounds(300, 55, 100, 20);
        cliente.add(lblTel);

        JTextField txtTel = new JTextField();
        txtTel.setBounds(380, 55, 200, 25);
        cliente.add(txtTel);

        add(cliente);

        // PANEL FACTURA
        JPanel facturaPanel = new JPanel();
        facturaPanel.setBorder(new TitledBorder("Datos de factura"));
        facturaPanel.setBounds(20, 190, 700, 70);
        facturaPanel.setLayout(null);

        JLabel lblNum = new JLabel("N° Factura:");
        lblNum.setBounds(10, 25, 100, 20);
        facturaPanel.add(lblNum);

        JLabel num = new JLabel("1");
        num.setBounds(110, 25, 50, 20);
        facturaPanel.add(num);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(300, 25, 100, 20);
        facturaPanel.add(lblFecha);

        JLabel fecha = new JLabel("2021/05/21");
        fecha.setBounds(360, 25, 100, 20);
        facturaPanel.add(fecha);

        add(facturaPanel);

        // BOTONES
        JButton btnVer = new JButton("Ver listado de facturas");
        btnVer.setBounds(20, 270, 200, 30);
        add(btnVer);

        JButton btnAdd = new JButton("Añadir");
        btnAdd.setBounds(500, 270, 90, 30);
        add(btnAdd);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(600, 270, 100, 30);
        add(btnEliminar);

        // TABLA
        String[] columnas = {"Producto", "Cantidad", "Valor", "Sub Total"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        modelo.addRow(new Object[]{"Agua", 2, 500, 1000});
        modelo.addRow(new Object[]{"Cereal", 5, 1000, 5000});
        modelo.addRow(new Object[]{"Leche", 2, 300, 600});

        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 310, 700, 120);
        add(scroll);

        // TOTALES
        JLabel subtotal = new JLabel("SubTotal:");
        subtotal.setBounds(20, 450, 100, 20);
        add(subtotal);

        JLabel subtotalVal = new JLabel("6600.0");
        subtotalVal.setBounds(100, 450, 100, 20);
        add(subtotalVal);

        JLabel desc = new JLabel("% Descuento:");
        desc.setBounds(20, 480, 100, 20);
        add(desc);

        JTextField txtDesc = new JTextField("5");
        txtDesc.setBounds(120, 480, 40, 25);
        add(txtDesc);

        JCheckBox check = new JCheckBox();
        check.setBounds(170, 480, 20, 25);
        add(check);

        JLabel valDesc = new JLabel("Valor descontado: 330.0");
        valDesc.setBounds(200, 480, 200, 20);
        add(valDesc);

        JLabel iva = new JLabel("IVA 19%:");
        iva.setBounds(20, 510, 100, 20);
        add(iva);

        JLabel ivaVal = new JLabel("1254.0");
        ivaVal.setBounds(100, 510, 100, 20);
        add(ivaVal);

        JLabel total = new JLabel("Total Factura:");
        total.setBounds(20, 540, 120, 20);
        add(total);

        JLabel totalVal = new JLabel("7524.0");
        totalVal.setBounds(140, 540, 100, 20);
        add(totalVal);

        JButton finalizar = new JButton("Finalizar factura");
        finalizar.setBounds(550, 520, 170, 30);
        add(finalizar);
    }
    }