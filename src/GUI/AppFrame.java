/*
package GUI;


import compress_decompress.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener {
    JButton compressorButton;
    JButton decompressorButton;

    AppFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressorButton = new JButton("select the compressor");
        compressorButton.setBounds(40, 90, 200, 40);
        compressorButton.addActionListener(this);

        decompressorButton = new JButton("select the decompressor");
        decompressorButton.setBounds(60, 100, 200, 40);
        decompressorButton.addActionListener(this);
        this.add(compressorButton);
        this.add(decompressorButton);
        this.setSize(1000, 500);

        this.getContentPane().setBackground(Color.BLACK);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == compressorButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                // System.out.print(file);
                try {
                    compressor.method(file);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }


            }

        } else if (ae.getSource() == decompressorButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                //System.out.print(file);
                try {
                    decompressor.method(file);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }


            }

        }

    }
}

 */



package GUI;

import compress_decompress.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener {
    JButton compressorButton;
    JButton decompressorButton;

    public AppFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressorButton = new JButton("Select the compressor");
        compressorButton.setBounds(200, 100, 200, 40);
        compressorButton.addActionListener(this);

        decompressorButton = new JButton("Select the decompressor");
        decompressorButton.setBounds(200, 200, 200, 40);
        decompressorButton.addActionListener(this);

        this.add(compressorButton);
        this.add(decompressorButton);
        this.setSize(500, 200);

        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == compressorButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

                try {
                    compressor.method(file);
                    JOptionPane.showMessageDialog(null, "Compression completed successfully.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            }
        } else if (ae.getSource() == decompressorButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

                try {
                    decompressor.method(file);
                    JOptionPane.showMessageDialog(null, "Decompression completed successfully.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            }
        }
    }

//    private void decompressorMethod(File file) throws Exception {
//        // Implement your decompression logic here, similar to the compressor method.
//        // For example:
//        // FileInputStream fis = new FileInputStream(file);
//        // FileOutputStream fos = new FileOutputStream("decompressedFile");
//        // GZIPInputStream gzip = new GZIPInputStream(fis);
//        // ...
//        // Don't forget to close your streams and handle exceptions properly.
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new AppFrame());
//    }
}


