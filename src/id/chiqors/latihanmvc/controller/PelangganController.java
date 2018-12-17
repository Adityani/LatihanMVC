/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.chiqors.latihanmvc.controller;

import id.chiqors.latihanmvc.model.PelangganModel;
import id.chiqors.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author
 * Nama  : Chiqo Rifky Saputra
 * Kelas : IF-2
 * NIM   : 10117054
 */
public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtNotelp().getText();
        
        if(nama != null && email != null && noTelp != null) {
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtNotelp().getText();
        
        if(nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama masih kosong");
        } else if(email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email masih kosong");
        } else if(noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telepon masih kosong");
        } else {
            model.simpanForm();
        }
    }
}
