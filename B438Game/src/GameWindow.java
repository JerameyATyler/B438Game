/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class GameWindow extends javax.swing.JFrame {

    public String[] getLetters()
    {
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        return letters;
    }
    
    public String getQuote()
    {
        return "test";
    }
    
    public String setLetter()
    {
        String original = jTextArea2.getText();
        StringBuilder guess = new StringBuilder(jTextArea1.getText());
        
        for(int i = 0; i < original.length(); i++)
        {
            if(Character.isUpperCase(original.charAt(i)))
            {
                switch(original.charAt(i))
                {
                    case 'A': guess.setCharAt(i, jComboBox1.getSelectedItem().toString().charAt(0));
                              break;
                    case 'B': guess.setCharAt(i, jComboBox2.getSelectedItem().toString().charAt(0));
                              break;
                    case 'C': guess.setCharAt(i, jComboBox3.getSelectedItem().toString().charAt(0));
                              break;
                    case 'D': guess.setCharAt(i, jComboBox4.getSelectedItem().toString().charAt(0));
                              break;
                    case 'E': guess.setCharAt(i, jComboBox5.getSelectedItem().toString().charAt(0));
                              break;
                    case 'F': guess.setCharAt(i, jComboBox6.getSelectedItem().toString().charAt(0));
                              break;
                    case 'G': guess.setCharAt(i, jComboBox7.getSelectedItem().toString().charAt(0));
                              break;
                    case 'H': guess.setCharAt(i, jComboBox8.getSelectedItem().toString().charAt(0));
                              break;
                    case 'I': guess.setCharAt(i, jComboBox9.getSelectedItem().toString().charAt(0));
                              break;
                    case 'J': guess.setCharAt(i, jComboBox10.getSelectedItem().toString().charAt(0));
                              break;
                    case 'K': guess.setCharAt(i, jComboBox11.getSelectedItem().toString().charAt(0));
                              break;
                    case 'L': guess.setCharAt(i, jComboBox12.getSelectedItem().toString().charAt(0));
                              break;
                    case 'M': guess.setCharAt(i, jComboBox13.getSelectedItem().toString().charAt(0));
                              break;
                    case 'N': guess.setCharAt(i, jComboBox14.getSelectedItem().toString().charAt(0));
                              break;
                    case 'O': guess.setCharAt(i, jComboBox15.getSelectedItem().toString().charAt(0));
                              break;
                    case 'P': guess.setCharAt(i, jComboBox16.getSelectedItem().toString().charAt(0));
                              break;
                    case 'Q': guess.setCharAt(i, jComboBox17.getSelectedItem().toString().charAt(0));
                              break;
                    case 'R': guess.setCharAt(i, jComboBox18.getSelectedItem().toString().charAt(0));
                              break;
                    case 'S': guess.setCharAt(i, jComboBox19.getSelectedItem().toString().charAt(0));
                              break;
                    case 'T': guess.setCharAt(i, jComboBox20.getSelectedItem().toString().charAt(0));
                              break;
                    case 'U': guess.setCharAt(i, jComboBox21.getSelectedItem().toString().charAt(0));
                              break;
                    case 'V': guess.setCharAt(i, jComboBox23.getSelectedItem().toString().charAt(0));
                              break;
                    case 'W': guess.setCharAt(i, jComboBox24.getSelectedItem().toString().charAt(0));
                              break;
                    case 'X': guess.setCharAt(i, jComboBox25.getSelectedItem().toString().charAt(0));
                              break;
                    case 'Y': guess.setCharAt(i, jComboBox26.getSelectedItem().toString().charAt(0));
                              break;
                    case 'Z': guess.setCharAt(i, jComboBox27.getSelectedItem().toString().charAt(0));
                              break;
                    default:  break;
                }
            }
            else
            {
                switch(original.charAt(i))
                {
                    case 'a': guess.setCharAt(i, Character.toLowerCase(jComboBox1.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'b': guess.setCharAt(i, Character.toLowerCase(jComboBox2.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'c': guess.setCharAt(i, Character.toLowerCase(jComboBox3.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'd': guess.setCharAt(i, Character.toLowerCase(jComboBox4.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'e': guess.setCharAt(i, Character.toLowerCase(jComboBox5.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'f': guess.setCharAt(i, Character.toLowerCase(jComboBox6.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'g': guess.setCharAt(i, Character.toLowerCase(jComboBox7.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'h': guess.setCharAt(i, Character.toLowerCase(jComboBox8.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'i': guess.setCharAt(i, Character.toLowerCase(jComboBox9.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'j': guess.setCharAt(i, Character.toLowerCase(jComboBox10.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'k': guess.setCharAt(i, Character.toLowerCase(jComboBox11.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'l': guess.setCharAt(i, Character.toLowerCase(jComboBox12.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'm': guess.setCharAt(i, Character.toLowerCase(jComboBox13.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'n': guess.setCharAt(i, Character.toLowerCase(jComboBox14.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'o': guess.setCharAt(i, Character.toLowerCase(jComboBox15.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'p': guess.setCharAt(i, Character.toLowerCase(jComboBox16.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'q': guess.setCharAt(i, Character.toLowerCase(jComboBox17.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'r': guess.setCharAt(i, Character.toLowerCase(jComboBox18.getSelectedItem().toString().charAt(0)));
                              break;
                    case 's': guess.setCharAt(i, Character.toLowerCase(jComboBox19.getSelectedItem().toString().charAt(0)));
                              break;
                    case 't': guess.setCharAt(i, Character.toLowerCase(jComboBox20.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'u': guess.setCharAt(i, Character.toLowerCase(jComboBox21.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'v': guess.setCharAt(i, Character.toLowerCase(jComboBox23.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'w': guess.setCharAt(i, Character.toLowerCase(jComboBox24.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'x': guess.setCharAt(i, Character.toLowerCase(jComboBox25.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'y': guess.setCharAt(i, Character.toLowerCase(jComboBox26.getSelectedItem().toString().charAt(0)));
                              break;
                    case 'z': guess.setCharAt(i, Character.toLowerCase(jComboBox27.getSelectedItem().toString().charAt(0)));
                              break;
                }                   
            }
        }        
        return guess.toString();
    }
    
    /**
     * Creates new form GameWindow
     */
    public GameWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox23 = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jComboBox24 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jComboBox25 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jComboBox26 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jComboBox27 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Quote Text. B c\nAuthor.");
        jTextArea1.setFocusable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("A");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox1.setSelectedItem(jComboBox1.getModel().getElementAt(0));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("B");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox2.setSelectedItem(jComboBox2.getModel().getElementAt(1));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("C");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox3.setSelectedItem(jComboBox3.getModel().getElementAt(2));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("D");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox4.setSelectedItem(jComboBox4.getModel().getElementAt(3));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox5.setSelectedItem(jComboBox5.getModel().getElementAt(4));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("F");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox6.setSelectedItem(jComboBox6.getModel().getElementAt(5));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("G");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox7.setSelectedItem(jComboBox7.getModel().getElementAt(6));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("H");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox8.setSelectedItem(jComboBox8.getModel().getElementAt(7));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("I");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox9.setSelectedItem(jComboBox9.getModel().getElementAt(8));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("J");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox10.setSelectedItem(jComboBox10.getModel().getElementAt(9));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("K");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox11.setSelectedItem(jComboBox11.getModel().getElementAt(10));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("L");

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox12.setSelectedItem(jComboBox12.getModel().getElementAt(11));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("M");

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox13.setSelectedItem(jComboBox13.getModel().getElementAt(12));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox14.setSelectedItem(jComboBox14.getModel().getElementAt(13));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("N");

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox15.setSelectedItem(jComboBox15.getModel().getElementAt(14));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("O");

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox16.setSelectedItem(jComboBox16.getModel().getElementAt(15));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("P");

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox17.setSelectedItem(jComboBox17.getModel().getElementAt(16));
        jComboBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Q");

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox18.setSelectedItem(jComboBox18.getModel().getElementAt(17));
        jComboBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("R");

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox19.setSelectedItem(jComboBox19.getModel().getElementAt(18));
        jComboBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("S");

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox20.setSelectedItem(jComboBox20.getModel().getElementAt(19));
        jComboBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("T");

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox21.setSelectedItem(jComboBox21.getModel().getElementAt(20));
        jComboBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("U");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("V");

        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox23.setSelectedItem(jComboBox23.getModel().getElementAt(21));
        jComboBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("W");

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox24.setSelectedItem(jComboBox24.getModel().getElementAt(22));
        jComboBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("X");

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox25.setSelectedItem(jComboBox25.getModel().getElementAt(23));
        jComboBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Y");

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox26.setSelectedItem(jComboBox26.getModel().getElementAt(24));
        jComboBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Z");

        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel(getLetters()));
        jComboBox27.setSelectedItem(jComboBox27.getModel().getElementAt(25));
        jComboBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("New Puzzle");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Quote Text. B c\nAuthor.");
        jTextArea2.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextArea2, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(332, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(getQuote());
        jTextArea2.setText(getQuote());
        jComboBox1.setSelectedItem(jComboBox1.getModel().getElementAt(0));
        jComboBox2.setSelectedItem(jComboBox2.getModel().getElementAt(1));
        jComboBox3.setSelectedItem(jComboBox3.getModel().getElementAt(2));
        jComboBox4.setSelectedItem(jComboBox4.getModel().getElementAt(3));
        jComboBox5.setSelectedItem(jComboBox5.getModel().getElementAt(4));
        jComboBox6.setSelectedItem(jComboBox6.getModel().getElementAt(5));
        jComboBox7.setSelectedItem(jComboBox7.getModel().getElementAt(6));
        jComboBox8.setSelectedItem(jComboBox8.getModel().getElementAt(7));
        jComboBox9.setSelectedItem(jComboBox9.getModel().getElementAt(8));
        jComboBox10.setSelectedItem(jComboBox10.getModel().getElementAt(9));
        jComboBox11.setSelectedItem(jComboBox11.getModel().getElementAt(10));
        jComboBox12.setSelectedItem(jComboBox12.getModel().getElementAt(11));
        jComboBox13.setSelectedItem(jComboBox13.getModel().getElementAt(12));
        jComboBox14.setSelectedItem(jComboBox14.getModel().getElementAt(13));
        jComboBox15.setSelectedItem(jComboBox15.getModel().getElementAt(14));
        jComboBox16.setSelectedItem(jComboBox16.getModel().getElementAt(15));
        jComboBox17.setSelectedItem(jComboBox17.getModel().getElementAt(16));
        jComboBox18.setSelectedItem(jComboBox18.getModel().getElementAt(17));
        jComboBox19.setSelectedItem(jComboBox19.getModel().getElementAt(18));
        jComboBox20.setSelectedItem(jComboBox20.getModel().getElementAt(19));
        jComboBox21.setSelectedItem(jComboBox21.getModel().getElementAt(20));
        jComboBox23.setSelectedItem(jComboBox23.getModel().getElementAt(21));
        jComboBox24.setSelectedItem(jComboBox24.getModel().getElementAt(22));
        jComboBox25.setSelectedItem(jComboBox25.getModel().getElementAt(23));
        jComboBox26.setSelectedItem(jComboBox26.getModel().getElementAt(24));
        jComboBox27.setSelectedItem(jComboBox27.getModel().getElementAt(25));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
            // TODO add your handling code here:
        jTextArea1.setText(setLetter());        
    }//GEN-LAST:event_jComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox18;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox21;
    private javax.swing.JComboBox jComboBox23;
    private javax.swing.JComboBox jComboBox24;
    private javax.swing.JComboBox jComboBox25;
    private javax.swing.JComboBox jComboBox26;
    private javax.swing.JComboBox jComboBox27;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
