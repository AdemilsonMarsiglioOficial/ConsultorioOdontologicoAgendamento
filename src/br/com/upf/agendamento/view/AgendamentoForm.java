/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.upf.agendamento.view;

import br.com.upf.agendamento.view.util.JFormattedHora;
import br.com.parcerianet.generic.modelo.util.controls.OrderBy;
import br.com.parcerianet.utilcomp.components.JPComboBox;
import br.com.parcerianet.utilcomp.components.formatacao.LimitaTextField;
import br.com.upf.agendamento.control.basico.PacienteCon;
import br.com.upf.agendamento.view.imagens.Imagens;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import org.hibernate.criterion.Order;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Ademilsom
 */
public class AgendamentoForm extends javax.swing.JPanel {

    /**
     * Creates new form AgendamentoForm
     */
    PacienteCon pacienteCon = new PacienteCon();

    public AgendamentoForm() {
        initComponents();

        btnCadastrarPaciente.setContentAreaFilled(false);

        pacienteCon.setOrderByClause(new OrderBy[]{
            new OrderBy(Order.asc("nmPaciente"))
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblPaciente = new javax.swing.JLabel();
        cbxPaciente = new br.com.parcerianet.utilcomp.components.JPComboBox();
        lblDtInicio = new javax.swing.JLabel();
        lblObservacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservacao = new javax.swing.JTextArea();
        btnCadastrarPaciente = new javax.swing.JButton();
        lblHoraInicio = new javax.swing.JLabel();
        lblHoraFim = new javax.swing.JLabel();
        txfHrInicio = new JFormattedHora();
        txfHrFim = new JFormattedHora();
        jdcInicio = new org.jdesktop.swingx.JXDatePicker();

        setLayout(new java.awt.GridBagLayout());

        lblPaciente.setText("Paciente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(lblPaciente, gridBagConstraints);

        cbxPaciente.setModel(new DefaultComboBoxModel(pacienteCon.getLista().toArray()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(cbxPaciente, gridBagConstraints);

        lblDtInicio.setText("Data Atendimento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(lblDtInicio, gridBagConstraints);

        lblObservacao.setText("Observações");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(lblObservacao, gridBagConstraints);

        txaObservacao.setColumns(20);
        txaObservacao.setDocument(new LimitaTextField(200));
        txaObservacao.setRows(5);
        jScrollPane1.setViewportView(txaObservacao);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(jScrollPane1, gridBagConstraints);

        btnCadastrarPaciente.setIcon(Imagens.IMG_ADD);
        btnCadastrarPaciente.setToolTipText("Cadastro Paciente Rápido");
        btnCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPacienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        add(btnCadastrarPaciente, gridBagConstraints);

        lblHoraInicio.setText("Hora Inicio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(lblHoraInicio, gridBagConstraints);

        lblHoraFim.setText("Hora Fim");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        add(lblHoraFim, gridBagConstraints);

        txfHrInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfHrInicioFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(txfHrInicio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(txfHrFim, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(jdcInicio, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private JPopupMenu popupMenu;
    private CadastroPacienteRapidoForm cadastroPacienteRapidoForm;

    private void btnCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPacienteActionPerformed

        if (cadastroPacienteRapidoForm == null) {
            cadastroPacienteRapidoForm = new CadastroPacienteRapidoForm();

            cadastroPacienteRapidoForm.getBtnSalvar().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (cadastroPacienteRapidoForm.gravarPaciente()) {
                        popupMenu.setVisible(false);

                        cbxPaciente.setModel(new DefaultComboBoxModel(pacienteCon.getLista().toArray()));
                        cbxPaciente.setSelectedItem(cadastroPacienteRapidoForm.getPaciente());
                    }
                }
            });

            cadastroPacienteRapidoForm.getBtnCancelar().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    popupMenu.setVisible(false);
                }
            });
        }

        cadastroPacienteRapidoForm.limpaField();

        JButton btnCadastro = (JButton) evt.getSource();

        popupMenu = new JPopupMenu();
        popupMenu.add(cadastroPacienteRapidoForm);
        popupMenu.setSize(350, 220);

        int x = btnCadastro.getWidth() - (int) popupMenu.getPreferredSize().getWidth() - popupMenu.getX();
        int y = -popupMenu.getPreferredSize().height;
        popupMenu.show(btnCadastro, x, y);
    }//GEN-LAST:event_btnCadastrarPacienteActionPerformed

    private void txfHrInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfHrInicioFocusLost
        JFormattedHora fieldInicio = ((JFormattedHora) evt.getSource());
        ((JFormattedHora) txfHrFim).setHoraField((fieldInicio.getHora() + 1), fieldInicio.getMinuto());
    }//GEN-LAST:event_txfHrInicioFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPaciente;
    private br.com.parcerianet.utilcomp.components.JPComboBox cbxPaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jdcInicio;
    private javax.swing.JLabel lblDtInicio;
    private javax.swing.JLabel lblHoraFim;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JTextArea txaObservacao;
    private javax.swing.JFormattedTextField txfHrFim;
    private javax.swing.JFormattedTextField txfHrInicio;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnCadastrarCliente() {
        return btnCadastrarPaciente;
    }

    public JPComboBox getCbxPaciente() {
        return cbxPaciente;
    }

    public JXDatePicker getJdcDtInicio() {
        return jdcInicio;
    }

    public JTextArea getTxaObservacao() {
        return txaObservacao;
    }

    public void setHrInicio(String hrInicio) {
//        horaInicio.setValue(Integer.parseInt(hrInicio.substring(0, 2)));
//        minutoInicio.setValue(Integer.parseInt(hrInicio.substring(3, 5)));

        txfHrInicio.setText(hrInicio);
    }

    public void setHrFim(String hrFim) {
//        horaFim.setValue(Integer.parseInt(hrFim.substring(0, 2)));
//        minutoFim.setValue(Integer.parseInt(hrFim.substring(3, 5)));
        txfHrFim.setText(hrFim);
    }

    public String getHrInicio() {
        return txfHrInicio.getText();
    }

    public String getHrFim() {
        return txfHrFim.getText();
    }

    /*    
     public String getHrInicio(){
        
     int value = horaInicio.getValue();
     if(String.valueOf(value).isEmpty()){
     return "";
     }  
     if(value > 23){
     return "";
     }  
     if(value < 0){
     return "";
     }  
        
        
     value = minutoInicio.getValue();
     if(String.valueOf(value).isEmpty()){
     return "";
     }
        
     if(value < 0){
     return "";
     } 
        
     if(value > 59){
     return "";
     } 
        
        
     String hora;
     if(horaInicio.getValue() < 9){
     hora = "0" + horaInicio.getValue();
     } else{
     hora = String.valueOf(horaInicio.getValue());
     }
        
     String minuto;
     if(minutoInicio.getValue() < 9){
     minuto = "0" + minutoInicio.getValue();
     } else {
     minuto = String.valueOf(minutoInicio.getValue());
     }
        
     return hora + ":" + minuto;
     }
    
     public String getHrFim(){
        
     int value = horaFim.getValue();
     if(String.valueOf(value).isEmpty()){
     return "";
     }  
     if(value > 23){
     return "";
     }  
     if(value < 0){
     return "";
     }  
        
        
     value = minutoFim.getValue();
     if(String.valueOf(value).isEmpty()){
     return "";
     }
        
     if(value < 0){
     return "";
     } 
        
     if(value > 59){
     return "";
     } 
               
     String hora;
     if(horaFim.getValue() < 9){
     hora = "0" + horaFim.getValue();
     } else{
     hora = String.valueOf(horaFim.getValue());
     }
        
     String minuto;
     if(minutoFim.getValue() < 9){
     minuto = "0" + minutoFim.getValue();
     } else {
     minuto = String.valueOf(minutoFim.getValue());
     }
        
     return hora + ":" + minuto;
     }*/
}
