/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import view.DashBoard;
import view.LogIn;
import view.PurchaseReportView;
import view.PurchaseView;
import view.SalesReportView;
import view.SalesView;

/**
 *
 * @author User
 */
public class MenuForm {
    public static JMenuBar commonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem dashboard = new JMenuItem("Dashboard");
        dashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashBoard().setVisible(true);
            }
        });
        JMenuItem purchase = new JMenuItem("Purchase");
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PurchaseView().setVisible(true);
            }
        });
        JMenuItem sales = new JMenuItem("Sales");
        sales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesView().setVisible(true);
            }
        });
        JMenuItem signOut = new JMenuItem("Sign Out");
        signOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogIn().setVisible(true);
            }
        });
        file.add(dashboard);
        file.addSeparator();
        file.add(purchase);
        file.addSeparator();
        file.add(sales);
        file.addSeparator();
        file.add(signOut);
        
        JMenu report = new JMenu("Report");
        JMenuItem purchaseReport = new JMenuItem("Purchase");
        purchaseReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PurchaseReportView().setVisible(true);
            }
        });
        JMenuItem saleReport = new JMenuItem("Sales");
        saleReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesReportView().setVisible(true);
            }
        });
        report.add(purchaseReport);
        report.add(saleReport);
        
        JMenu help = new JMenu("Help");
        JMenu about = new JMenu("About");
        
        menuBar.add(file);
        menuBar.add(report);
        menuBar.add(help);
        menuBar.add(about);
        
        f.setJMenuBar(menuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        return menuBar;
    }
}
