package br.com.mercadinho_sena.tabelas;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import br.com.mercadinho_sena.DAO.ProdutosDAO;
import br.com.mercadinho_sena.encapsulamentos.Produtos;

public class Cadastrar_Produto extends javax.swing.JFrame {

    public Cadastrar_Produto() {
         setTitle("Cadastrar Produtos");
         initComponents();
         
         DefaultTableModel modelo = (DefaultTableModel) tbInfo.getModel();
         tbInfo.setRowSorter(new TableRowSorter<DefaultTableModel>(modelo));
        
         readJTable();
    }
    
    public void readJTable() {
      	 DefaultTableModel modelo = (DefaultTableModel) tbInfo.getModel();
      	 modelo.setNumRows(0);
      	 ProdutosDAO pdao = new ProdutosDAO();
      	 for(Produtos p: pdao.read()) {
               modelo.addRow(new Object[]{
               	 p.getId_produto(),	
              		 p.getCodigo(),
              		 p.getFornecedor(),
              		 p.getNome(),
              		 p.getMarca(),
              		 p.getQuantidade(),
              		 p.getValor_fornecedor(),
              		 p.getValor_produto(),
              		 p.getData_compra_produto()
               });    		 
      	 }
      }
    
    public void readJTableNome(String nome) {
     	 DefaultTableModel modelo = (DefaultTableModel) tbInfo.getModel();
     	 modelo.setNumRows(0);
     	 ProdutosDAO pdao = new ProdutosDAO();
     	 for(Produtos p: pdao.readNome(nome)) {
              modelo.addRow(new Object[]{
              	 p.getId_produto(),	
             		 p.getCodigo(),
             		 p.getFornecedor(),
             		 p.getNome(),
             		 p.getMarca(),
             		 p.getQuantidade(),
             		 p.getValor_fornecedor(),
             		 p.getValor_produto(),
             		 p.getData_compra_produto()
              });    		 
     	 }
     }

    @SuppressWarnings("unchecked")                      
    private void initComponents() {

        txtForn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPforn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPmerc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInfo = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Fornecedor");

        jLabel3.setText("Marca Produto");

        jLabel4.setText("Nome Produto");

        txtQtd.setText("0000");

        jLabel5.setText("Quantidade");

        txtData.setText("dd/mm/aaaa");

        jLabel6.setText("Data da Compra");

        txtPforn.setText("0,00 R$");

        jLabel7.setText("Preço Fornecdor");

        txtPmerc.setText("0,00 R$");

        jLabel8.setText("Preço Mercadinho");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Altera");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tbInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "codigo", "Fornecedor", "Nome", "Marca", "Quantidade", "Preço Fornecedor", "Preço Mercadinho", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInfo);

        jLabel1.setText("Codigo Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo)
                                .addGap(42, 42, 42)
                                .addComponent(txtForn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtQtd)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(131, 131, 131)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPforn))
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPmerc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtData))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPforn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPmerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
    	
    	Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        p.setCodigo(Integer.parseInt(txtCodigo.getText()));
        p.setFornecedor(txtForn.getText());
        p.setNome(txtNome.getText());
        p.setMarca(txtMarca.getText());
        p.setQuantidade(Integer.parseInt(txtQtd.getText()));
        p.setValor_fornecedor(Float.parseFloat(txtPforn.getText()));
        p.setValor_produto(Float.parseFloat(txtPmerc.getText()));
        p.setData_compra_produto(txtData.getText());
        dao.adiciona(p);
        
        txtCodigo.setText("");
        txtForn.setText("");
        txtNome.setText("");
        txtMarca.setText("");
        txtQtd.setText("");
        txtPforn.setText("");
        txtPmerc.setText("");
        txtData.setText("");
        
        readJTable();
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	
      if(tbInfo.getSelectedRow() != -1) {
    	
    	Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        p.setCodigo(Integer.parseInt(txtCodigo.getText()));
        p.setFornecedor(txtForn.getText());
        p.setNome(txtNome.getText());
        p.setMarca(txtMarca.getText());
        p.setQuantidade(Integer.parseInt(txtQtd.getText()));
        p.setValor_fornecedor(Float.parseFloat(txtPforn.getText()));
        p.setValor_produto(Float.parseFloat(txtPmerc.getText()));
        p.setData_compra_produto(txtData.getText());
        p.setId_produto((int)tbInfo.getValueAt(tbInfo.getSelectedRow(), 0));
        dao.alterar(p);
        
        txtCodigo.setText("");
        txtForn.setText("");
        txtNome.setText("");
        txtMarca.setText("");
        txtQtd.setText("");
        txtPforn.setText("");
        txtPmerc.setText("");
        txtData.setText("");
        
        readJTable();
        
      }
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	
      if(tbInfo.getSelectedRow() != -1) {	
    	  
    	 Produtos p = new Produtos();
         ProdutosDAO dao = new ProdutosDAO();
         p.setId_produto((int)tbInfo.getValueAt(tbInfo.getSelectedRow(), 0));
         dao.deletar(p);
         
         txtCodigo.setText("");
         txtForn.setText("");
         txtNome.setText("");
         txtMarca.setText("");
         txtQtd.setText("");
         txtPforn.setText("");
         txtPmerc.setText("");
         txtData.setText("");
         
         readJTable();
         
      }
         
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        readJTableNome(txtBuscar.getText());
        
    }                                        

    private void tbInfoMouseClicked(java.awt.event.MouseEvent evt) {
    	
      if(tbInfo.getSelectedRow() != -1) {	 
    	
    	 txtCodigo.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 1).toString());
    	 txtForn.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 2).toString());
    	 txtNome.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 3).toString());
    	 txtMarca.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 4).toString());
    	 txtQtd.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 5).toString());
    	 txtPforn.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 6).toString());
    	 txtPmerc.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 7).toString());
    	 txtData.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 8).toString());
    	 
       }
    	 
    }                                   

    public static void main(String args[]) {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_Produto().setVisible(true);
            }
        });
    }
                  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbInfo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtForn;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPforn;
    private javax.swing.JTextField txtPmerc;
    private javax.swing.JTextField txtQtd;
                
}
