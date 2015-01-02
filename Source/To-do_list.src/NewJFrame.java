/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JSeparator;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle.ComponentPlacement;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class NewJFrame extends JFrame
/*     */ {
/*     */   private JComboBox daychoose;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JComboBox jComboBox1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JSeparator jSeparator1;
/*     */   private JLabel list1;
/*     */   private JLabel list2;
/*     */   private JLabel list3;
/*     */   private JLabel list4;
/*     */   private JLabel list5;
/*     */   private JLabel list6;
/*     */   private JLabel list7;
/*     */   private JLabel list8;
/*     */   private JLabel list9;
/*     */   private JComboBox monthchoose;
/*     */   private JButton tag1;
/*     */   private JButton tag2;
/*     */   private JButton tag3;
/*     */   private JButton tag4;
/*     */   private JButton tag5;
/*     */   private JButton tag6;
/*     */   private JButton tag7;
/*     */   private JButton tag8;
/*     */   private JButton tag9;
/*     */   private JTextField taskentered;
/*     */   private JButton todotagfull;
/*     */   private JLabel tomorrow1;
/*     */   private JLabel tomorrow2;
/*     */   private JLabel tomorrow3;
/*     */   private JLabel tomorrow4;
/*     */   private JLabel tomorrow5;
/*     */   private JLabel tomorrow6;
/*     */   private JLabel tomorrow7;
/*     */   private JLabel tomorrow8;
/*     */   private JLabel tomorrow9;
/*     */   private JLabel total1;
/*     */   private JLabel total2;
/*     */   private JLabel total3;
/*     */   private JLabel total4;
/*     */   private JLabel total5;
/*     */   private JLabel total6;
/*     */   private JLabel total7;
/*     */   private JLabel total8;
/*     */   private JLabel total9;
/*     */   private JComboBox yearchoose;
/*     */ 
/*     */   public NewJFrame()
/*     */   {
/*  29 */     initComponents();
/*     */ 
/*  38 */     if ("none".equals(ToDoList.main[0].getTitle())) {
/*  39 */       this.tag1.setVisible(false);
/*  40 */       this.list1.setVisible(false);
/*  41 */       this.total1.setVisible(false);
/*  42 */       this.tomorrow1.setVisible(false);
/*     */     }
/*  44 */     if ("none".equals(ToDoList.main[1].getTitle())) {
/*  45 */       this.tag2.setVisible(false);
/*  46 */       this.list2.setVisible(false);
/*  47 */       this.total2.setVisible(false);
/*  48 */       this.tomorrow2.setVisible(false);
/*     */     }
/*  50 */     if ("none".equals(ToDoList.main[2].getTitle())) {
/*  51 */       this.tag3.setVisible(false);
/*  52 */       this.list3.setVisible(false);
/*  53 */       this.total3.setVisible(false);
/*  54 */       this.tomorrow3.setVisible(false);
/*     */     }
/*  56 */     if ("none".equals(ToDoList.main[3].getTitle())) {
/*  57 */       this.tag4.setVisible(false);
/*  58 */       this.list4.setVisible(false);
/*  59 */       this.total4.setVisible(false);
/*  60 */       this.tomorrow4.setVisible(false);
/*     */     }
/*  62 */     if ("none".equals(ToDoList.main[4].getTitle())) {
/*  63 */       this.tag5.setVisible(false);
/*  64 */       this.list5.setVisible(false);
/*  65 */       this.total5.setVisible(false);
/*  66 */       this.tomorrow5.setVisible(false);
/*     */     }
/*  68 */     if ("none".equals(ToDoList.main[5].getTitle())) {
/*  69 */       this.tag6.setVisible(false);
/*  70 */       this.list6.setVisible(false);
/*  71 */       this.total6.setVisible(false);
/*  72 */       this.tomorrow6.setVisible(false);
/*     */     }
/*  74 */     if ("none".equals(ToDoList.main[6].getTitle())) {
/*  75 */       this.tag7.setVisible(false);
/*  76 */       this.list7.setVisible(false);
/*  77 */       this.total7.setVisible(false);
/*  78 */       this.tomorrow7.setVisible(false);
/*     */     }
/*  80 */     if ("none".equals(ToDoList.main[7].getTitle())) {
/*  81 */       this.tag8.setVisible(false);
/*  82 */       this.list8.setVisible(false);
/*  83 */       this.total8.setVisible(false);
/*  84 */       this.tomorrow8.setVisible(false);
/*     */     }
/*  86 */     if ("none".equals(ToDoList.main[8].getTitle())) {
/*  87 */       this.tag9.setVisible(false);
/*  88 */       this.list9.setVisible(false);
/*  89 */       this.total9.setVisible(false);
/*  90 */       this.tomorrow9.setVisible(false);
/*     */ 
/*  92 */       setIcon();
/*     */     }
/*     */   }
/*     */ 
/*     */   private void initComponents()
/*     */   {
/* 106 */     this.jComboBox1 = new JComboBox();
/* 107 */     this.jLabel1 = new JLabel();
/* 108 */     this.taskentered = new JTextField();
/* 109 */     this.tag1 = new JButton();
/* 110 */     this.tag2 = new JButton();
/* 111 */     this.tag3 = new JButton();
/* 112 */     this.tag4 = new JButton();
/* 113 */     this.tag5 = new JButton();
/* 114 */     this.tag6 = new JButton();
/* 115 */     this.todotagfull = new JButton();
/* 116 */     this.tag7 = new JButton();
/* 117 */     this.tag8 = new JButton();
/* 118 */     this.tag9 = new JButton();
/* 119 */     this.monthchoose = new JComboBox();
/* 120 */     this.daychoose = new JComboBox();
/* 121 */     this.yearchoose = new JComboBox();
/* 122 */     this.jButton1 = new JButton();
/* 123 */     this.jSeparator1 = new JSeparator();
/* 124 */     this.jLabel2 = new JLabel();
/* 125 */     this.list1 = new JLabel();
/* 126 */     this.list2 = new JLabel();
/* 127 */     this.list3 = new JLabel();
/* 128 */     this.list5 = new JLabel();
/* 129 */     this.list4 = new JLabel();
/* 130 */     this.list6 = new JLabel();
/* 131 */     this.list7 = new JLabel();
/* 132 */     this.list8 = new JLabel();
/* 133 */     this.list9 = new JLabel();
/* 134 */     this.jLabel3 = new JLabel();
/* 135 */     this.jLabel4 = new JLabel();
/* 136 */     this.total1 = new JLabel();
/* 137 */     this.tomorrow1 = new JLabel();
/* 138 */     this.total2 = new JLabel();
/* 139 */     this.total3 = new JLabel();
/* 140 */     this.total4 = new JLabel();
/* 141 */     this.total5 = new JLabel();
/* 142 */     this.total6 = new JLabel();
/* 143 */     this.total7 = new JLabel();
/* 144 */     this.total8 = new JLabel();
/* 145 */     this.total9 = new JLabel();
/* 146 */     this.tomorrow2 = new JLabel();
/* 147 */     this.tomorrow3 = new JLabel();
/* 148 */     this.tomorrow4 = new JLabel();
/* 149 */     this.tomorrow5 = new JLabel();
/* 150 */     this.tomorrow6 = new JLabel();
/* 151 */     this.tomorrow7 = new JLabel();
/* 152 */     this.tomorrow8 = new JLabel();
/* 153 */     this.tomorrow9 = new JLabel();
/* 154 */     this.jButton2 = new JButton();
/*     */ 
/* 156 */     this.jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
/*     */ 
/* 158 */     setDefaultCloseOperation(2);
/* 159 */     setTitle("To-Do List");
/*     */ 
/* 161 */     this.jLabel1.setFont(new Font("Tahoma", 1, 24));
/* 162 */     this.jLabel1.setText("To-Do List");
/*     */ 
/* 164 */     this.taskentered.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 166 */         NewJFrame.this.taskenteredActionPerformed(evt);
/*     */       }
/*     */     });
/* 170 */     this.tag1.setText(ToDoList.main[0].getTitle());
/* 171 */     this.tag1.setCursor(new Cursor(12));
/* 172 */     this.tag1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 174 */         NewJFrame.this.tag1ActionPerformed(evt);
/*     */       }
/*     */     });
/* 178 */     this.tag2.setText(ToDoList.main[1].getTitle());
/* 179 */     this.tag2.setCursor(new Cursor(12));
/* 180 */     this.tag2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 182 */         NewJFrame.this.tag2ActionPerformed(evt);
/*     */       }
/*     */     });
/* 186 */     this.tag3.setText(ToDoList.main[2].getTitle());
/* 187 */     this.tag3.setCursor(new Cursor(12));
/* 188 */     this.tag3.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 190 */         NewJFrame.this.tag3ActionPerformed(evt);
/*     */       }
/*     */     });
/* 194 */     this.tag4.setText(ToDoList.main[3].getTitle());
/* 195 */     this.tag4.setCursor(new Cursor(12));
/* 196 */     this.tag4.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 198 */         NewJFrame.this.tag4ActionPerformed(evt);
/*     */       }
/*     */     });
/* 202 */     this.tag5.setText(ToDoList.main[4].getTitle());
/* 203 */     this.tag5.setCursor(new Cursor(12));
/* 204 */     this.tag5.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 206 */         NewJFrame.this.tag5ActionPerformed(evt);
/*     */       }
/*     */     });
/* 210 */     this.tag6.setText(ToDoList.main[5].getTitle());
/* 211 */     this.tag6.setCursor(new Cursor(12));
/* 212 */     this.tag6.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 214 */         NewJFrame.this.tag6ActionPerformed(evt);
/*     */       }
/*     */     });
/* 218 */     this.todotagfull.setBackground(new Color(255, 0, 51));
/* 219 */     this.todotagfull.setText("Save in ...");
/* 220 */     this.todotagfull.setToolTipText("");
/* 221 */     this.todotagfull.setCursor(new Cursor(12));
/* 222 */     this.todotagfull.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 224 */         NewJFrame.this.todotagfullActionPerformed(evt);
/*     */       }
/*     */     });
/* 228 */     this.tag7.setText(ToDoList.main[6].getTitle());
/* 229 */     this.tag7.setCursor(new Cursor(12));
/* 230 */     this.tag7.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 232 */         NewJFrame.this.tag7ActionPerformed(evt);
/*     */       }
/*     */     });
/* 236 */     this.tag8.setText(ToDoList.main[7].getTitle());
/* 237 */     this.tag8.setCursor(new Cursor(12));
/* 238 */     this.tag8.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 240 */         NewJFrame.this.tag8ActionPerformed(evt);
/*     */       }
/*     */     });
/* 244 */     this.tag9.setText(ToDoList.main[8].getTitle());
/* 245 */     this.tag9.setCursor(new Cursor(12));
/* 246 */     this.tag9.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 248 */         NewJFrame.this.tag9ActionPerformed(evt);
/*     */       }
/*     */     });
/* 252 */     this.monthchoose.setModel(new DefaultComboBoxModel(new String[] { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "Novemeber", "December" }));
/*     */ 
/* 254 */     this.daychoose.setModel(new DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
/* 255 */     this.daychoose.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 257 */         NewJFrame.this.daychooseActionPerformed(evt);
/*     */       }
/*     */     });
/* 261 */     this.yearchoose.setModel(new DefaultComboBoxModel(new String[] { "2013", "2014", "2015", "2016" }));
/* 262 */     this.yearchoose.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 264 */         NewJFrame.this.yearchooseActionPerformed(evt);
/*     */       }
/*     */     });
/* 268 */     this.jButton1.setText("Change Lists");
/* 269 */     this.jButton1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 271 */         NewJFrame.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */     });
/* 275 */     this.jLabel2.setFont(new Font("Tahoma", 1, 18));
/* 276 */     this.jLabel2.setText("To-Do");
/*     */ 
/* 278 */     this.list1.setText(ToDoList.main[0].getTitle());
/* 279 */     this.list1.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 281 */         NewJFrame.this.list1MouseClicked(evt);
/*     */       }
/*     */     });
/* 285 */     this.list2.setText(ToDoList.main[1].getTitle());
/* 286 */     this.list2.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 288 */         NewJFrame.this.list2MouseClicked(evt);
/*     */       }
/*     */     });
/* 292 */     this.list3.setText(ToDoList.main[2].getTitle());
/* 293 */     this.list3.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 295 */         NewJFrame.this.list3MouseClicked(evt);
/*     */       }
/*     */     });
/* 299 */     this.list5.setText(ToDoList.main[4].getTitle());
/* 300 */     this.list5.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 302 */         NewJFrame.this.list5MouseClicked(evt);
/*     */       }
/*     */     });
/* 306 */     this.list4.setText(ToDoList.main[3].getTitle());
/* 307 */     this.list4.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 309 */         NewJFrame.this.list4MouseClicked(evt);
/*     */       }
/*     */     });
/* 313 */     this.list6.setText(ToDoList.main[5].getTitle());
/* 314 */     this.list6.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 316 */         NewJFrame.this.list6MouseClicked(evt);
/*     */       }
/*     */     });
/* 320 */     this.list7.setText(ToDoList.main[6].getTitle());
/* 321 */     this.list7.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 323 */         NewJFrame.this.list7MouseClicked(evt);
/*     */       }
/*     */     });
/* 327 */     this.list8.setText(ToDoList.main[7].getTitle());
/* 328 */     this.list8.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 330 */         NewJFrame.this.list8MouseClicked(evt);
/*     */       }
/*     */     });
/* 334 */     this.list9.setText(ToDoList.main[8].getTitle());
/* 335 */     this.list9.addMouseListener(new MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/* 337 */         NewJFrame.this.list9MouseClicked(evt);
/*     */       }
/*     */     });
/* 341 */     this.jLabel3.setText("Total To-do's");
/*     */ 
/* 343 */     this.jLabel4.setText("To-do's due Tomorrow");
/*     */ 
/* 345 */     this.total1.setText(Integer.toString(ToDoList.main[0].getTotalTodo()));
/*     */ 
/* 347 */     this.tomorrow1.setText(Integer.toString(ToDoList.main[0].getDuetomorrow()));
/*     */ 
/* 349 */     this.total2.setText(Integer.toString(ToDoList.main[1].getTotalTodo()));
/*     */ 
/* 351 */     this.total3.setText(Integer.toString(ToDoList.main[2].getTotalTodo()));
/*     */ 
/* 353 */     this.total4.setText(Integer.toString(ToDoList.main[3].getTotalTodo()));
/*     */ 
/* 355 */     this.total5.setText(Integer.toString(ToDoList.main[4].getTotalTodo()));
/*     */ 
/* 357 */     this.total6.setText(Integer.toString(ToDoList.main[5].getTotalTodo()));
/*     */ 
/* 359 */     this.total7.setText(Integer.toString(ToDoList.main[6].getTotalTodo()));
/*     */ 
/* 361 */     this.total8.setText(Integer.toString(ToDoList.main[7].getTotalTodo()));
/*     */ 
/* 363 */     this.total9.setText(Integer.toString(ToDoList.main[8].getTotalTodo()));
/*     */ 
/* 365 */     this.tomorrow2.setText(Integer.toString(ToDoList.main[1].getDuetomorrow()));
/*     */ 
/* 367 */     this.tomorrow3.setText(Integer.toString(ToDoList.main[2].getDuetomorrow()));
/*     */ 
/* 369 */     this.tomorrow4.setText(Integer.toString(ToDoList.main[3].getDuetomorrow()));
/*     */ 
/* 371 */     this.tomorrow5.setText(Integer.toString(ToDoList.main[4].getDuetomorrow()));
/*     */ 
/* 373 */     this.tomorrow6.setText(Integer.toString(ToDoList.main[5].getDuetomorrow()));
/*     */ 
/* 375 */     this.tomorrow7.setText(Integer.toString(ToDoList.main[6].getDuetomorrow()));
/*     */ 
/* 377 */     this.tomorrow8.setText(Integer.toString(ToDoList.main[7].getDuetomorrow()));
/*     */ 
/* 379 */     this.tomorrow9.setText(Integer.toString(ToDoList.main[8].getDuetomorrow()));
/*     */ 
/* 381 */     this.jButton2.setText("Close");
/* 382 */     this.jButton2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 384 */         NewJFrame.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */     });
/* 388 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 389 */     getContentPane().setLayout(layout);
/* 390 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jSeparator1).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.list9, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total9)).addGroup(layout.createSequentialGroup().addComponent(this.list8, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total8)).addGroup(layout.createSequentialGroup().addComponent(this.list7, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total7)).addGroup(layout.createSequentialGroup().addComponent(this.list6, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total6)).addGroup(layout.createSequentialGroup().addComponent(this.list4, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total4)).addGroup(layout.createSequentialGroup().addComponent(this.list5, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total5)).addGroup(layout.createSequentialGroup().addComponent(this.list3, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total3)).addGroup(layout.createSequentialGroup().addComponent(this.list2, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total2)).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel1).addGroup(layout.createSequentialGroup().addComponent(this.tag1, -2, 112, -2).addGap(6, 6, 6).addComponent(this.tag2, -2, 112, -2).addGap(10, 10, 10).addComponent(this.tag3, -2, 112, -2)).addComponent(this.taskentered)).addGroup(layout.createSequentialGroup().addComponent(this.list1, -2, 126, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.total1))).addGap(0, 0, 32767)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.tag7, -2, 112, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.tag8, -2, 112, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.tag9, -2, 112, -2)).addGroup(layout.createSequentialGroup().addComponent(this.tag4, -2, 112, -2).addGap(6, 6, 6).addComponent(this.tag5, -2, 112, -2).addGap(10, 10, 10).addComponent(this.tag6, -2, 112, -2)).addGroup(layout.createSequentialGroup().addComponent(this.monthchoose, -2, 90, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.daychoose, -2, 47, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.yearchoose, -2, 59, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.todotagfull, -2, 138, -2))).addGap(0, 0, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel2).addGap(79, 79, 79).addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.tomorrow1).addComponent(this.jLabel4).addComponent(this.tomorrow2).addComponent(this.tomorrow3).addComponent(this.tomorrow4).addComponent(this.tomorrow5).addComponent(this.tomorrow6).addComponent(this.tomorrow7).addComponent(this.tomorrow8).addComponent(this.tomorrow9)))).addContainerGap()).addGroup(layout.createSequentialGroup().addComponent(this.jButton1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton2).addGap(30, 30, 30)))));
/*     */ 
/* 495 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel1).addGap(18, 18, 18).addComponent(this.taskentered, -2, -1, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.tag1).addComponent(this.tag2).addComponent(this.tag3)).addGap(11, 11, 11).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.tag4).addComponent(this.tag5).addComponent(this.tag6)).addGap(11, 11, 11).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.tag7).addComponent(this.tag8).addComponent(this.tag9)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.monthchoose, -2, -1, -2).addComponent(this.daychoose, -2, -1, -2).addComponent(this.yearchoose, -2, -1, -2).addComponent(this.todotagfull)).addGap(18, 18, 18).addComponent(this.jSeparator1, -2, 10, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.jLabel4)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list1).addComponent(this.total1).addComponent(this.tomorrow1)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list2).addComponent(this.total2).addComponent(this.tomorrow2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list3).addComponent(this.total3).addComponent(this.tomorrow3)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list4).addComponent(this.total4).addComponent(this.tomorrow4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list5).addComponent(this.total5).addComponent(this.tomorrow5)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list6).addComponent(this.total6).addComponent(this.tomorrow6)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list7).addComponent(this.total7).addComponent(this.tomorrow7)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list8).addComponent(this.total8).addComponent(this.tomorrow8)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.list9).addComponent(this.total9).addComponent(this.tomorrow9)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2)).addContainerGap()));
/*     */ 
/* 582 */     pack();
/*     */   }
/*     */ 
/*     */   private void taskenteredActionPerformed(ActionEvent evt)
/*     */   {
/*     */   }
/*     */ 
/*     */   private void tag1ActionPerformed(ActionEvent evt)
/*     */   {
/* 591 */     ToDoList.todotag = ToDoList.main[0].getTitle();
/* 592 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void tag2ActionPerformed(ActionEvent evt)
/*     */   {
/* 597 */     ToDoList.todotag = ToDoList.main[1].getTitle();
/* 598 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void tag3ActionPerformed(ActionEvent evt)
/*     */   {
/* 603 */     ToDoList.todotag = ToDoList.main[2].getTitle();
/* 604 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void tag4ActionPerformed(ActionEvent evt)
/*     */   {
/* 609 */     ToDoList.todotag = ToDoList.main[3].getTitle();
/* 610 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void tag5ActionPerformed(ActionEvent evt)
/*     */   {
/* 615 */     ToDoList.todotag = ToDoList.main[4].getTitle();
/* 616 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void tag6ActionPerformed(ActionEvent evt)
/*     */   {
/* 621 */     ToDoList.todotag = ToDoList.main[5].getTitle();
/* 622 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void tag7ActionPerformed(ActionEvent evt) {
/* 626 */     ToDoList.todotag = ToDoList.main[6].getTitle();
/* 627 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void tag8ActionPerformed(ActionEvent evt) {
/* 631 */     ToDoList.todotag = ToDoList.main[7].getTitle();
/* 632 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void tag9ActionPerformed(ActionEvent evt) {
/* 636 */     ToDoList.todotag = ToDoList.main[8].getTitle();
/* 637 */     this.todotagfull.setText("Save in " + ToDoList.todotag);
/*     */   }
/*     */ 
/*     */   private void daychooseActionPerformed(ActionEvent evt)
/*     */   {
/*     */   }
/*     */ 
/*     */   private void yearchooseActionPerformed(ActionEvent evt)
/*     */   {
/*     */   }
/*     */ 
/*     */   private void todotagfullActionPerformed(ActionEvent evt) {
/* 649 */     Boolean error = Boolean.valueOf(false);
/* 650 */     String monthch = this.monthchoose.getSelectedItem() + "";
/* 651 */     String daych = this.daychoose.getSelectedItem() + "";
/* 652 */     String yearch = this.yearchoose.getSelectedItem() + "";
/* 653 */     String datechoosen = monthch + " " + daych + " " + yearch;
/* 654 */     String tasktyped = this.taskentered.getText();
/* 655 */     if (!tools.dateright(monthch, daych, yearch)) {
/* 656 */       tools.error("Date entered doesn't exist");
/* 657 */       error = Boolean.valueOf(true);
/*     */     }
/* 659 */     if ("".equals(tasktyped)) {
/* 660 */       tools.error("Please enter text for your task");
/* 661 */       error = Boolean.valueOf(true);
/*     */     }
/* 663 */     if (ToDoList.todotag == " ") {
/* 664 */       tools.error("Please select a list");
/* 665 */       error = Boolean.valueOf(true);
/*     */     }
/* 667 */     if (!error.booleanValue()) {
/* 668 */       String datein = tools.daytonum(monthch) + "." + daych + "." + yearch;
/* 669 */       String datechoosenn = tools.dateconvert(datein);
/* 670 */       String writetofile = tasktyped + "," + datechoosenn;
/* 671 */       String file = ToDoList.path + "todo " + ToDoList.todotag.toLowerCase() + ".txt";
/* 672 */       tools.appendfile(writetofile, file);
/*     */ 
/* 674 */       NewJFrame n = new NewJFrame();
/* 675 */       dispose();
/* 676 */       n.refresh();
/*     */     }
/*     */   }
/*     */ 
/*     */   private void jButton1ActionPerformed(ActionEvent evt)
/*     */   {
/* 684 */     Change_subjects a = new Change_subjects();
/* 685 */     a.setVisible(true);
/* 686 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list1MouseClicked(MouseEvent evt)
/*     */   {
/* 693 */     ToDoList.todotag = ToDoList.main[0].getTitle();
/* 694 */     ToDoList.current = 0;
/*     */ 
/* 696 */     Show_todo x = new Show_todo();
/* 697 */     x.setVisible(true);
/* 698 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list2MouseClicked(MouseEvent evt) {
/* 702 */     ToDoList.todotag = ToDoList.main[1].getTitle();
/* 703 */     ToDoList.current = 1;
/*     */ 
/* 705 */     Show_todo x = new Show_todo();
/* 706 */     x.setVisible(true);
/* 707 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list3MouseClicked(MouseEvent evt) {
/* 711 */     ToDoList.todotag = ToDoList.main[2].getTitle();
/* 712 */     ToDoList.current = 2;
/*     */ 
/* 714 */     Show_todo x = new Show_todo();
/* 715 */     x.setVisible(true);
/* 716 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list4MouseClicked(MouseEvent evt) {
/* 720 */     ToDoList.todotag = ToDoList.main[3].getTitle();
/* 721 */     ToDoList.current = 3;
/*     */ 
/* 723 */     Show_todo x = new Show_todo();
/* 724 */     x.setVisible(true);
/* 725 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list5MouseClicked(MouseEvent evt) {
/* 729 */     ToDoList.todotag = ToDoList.main[4].getTitle();
/* 730 */     ToDoList.current = 4;
/*     */ 
/* 732 */     Show_todo x = new Show_todo();
/* 733 */     x.setVisible(true);
/* 734 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list6MouseClicked(MouseEvent evt) {
/* 738 */     ToDoList.todotag = ToDoList.main[5].getTitle();
/* 739 */     ToDoList.current = 5;
/*     */ 
/* 741 */     Show_todo x = new Show_todo();
/* 742 */     x.setVisible(true);
/* 743 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list7MouseClicked(MouseEvent evt) {
/* 747 */     ToDoList.todotag = ToDoList.main[6].getTitle();
/* 748 */     ToDoList.current = 6;
/*     */ 
/* 750 */     Show_todo x = new Show_todo();
/* 751 */     x.setVisible(true);
/* 752 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list8MouseClicked(MouseEvent evt) {
/* 756 */     ToDoList.todotag = ToDoList.main[7].getTitle();
/* 757 */     ToDoList.current = 7;
/*     */ 
/* 759 */     Show_todo x = new Show_todo();
/* 760 */     x.setVisible(true);
/* 761 */     dispose();
/*     */   }
/*     */ 
/*     */   private void list9MouseClicked(MouseEvent evt) {
/* 765 */     ToDoList.todotag = ToDoList.main[8].getTitle();
/* 766 */     ToDoList.current = 8;
/*     */ 
/* 768 */     Show_todo x = new Show_todo();
/* 769 */     x.setVisible(true);
/* 770 */     dispose();
/*     */   }
/*     */ 
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 774 */     System.exit(0);
/*     */   }
/*     */ 
/*     */   public void refresh() {
/* 778 */     for (int i = 0; i < 9; i++) {
/* 779 */       ToDoList.main[i] = initialize.initialize(i + 1);
/*     */     }
/* 781 */     EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 783 */         new NewJFrame().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 803 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
/* 804 */         if ("Nimbus".equals(info.getName())) {
/* 805 */           UIManager.setLookAndFeel(info.getClassName());
/* 806 */           break;
/*     */         }
/*     */     }
/*     */     catch (ClassNotFoundException ex) {
/* 810 */       Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 812 */       Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 814 */       Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (UnsupportedLookAndFeelException ex) {
/* 816 */       Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */ 
/* 821 */     EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 823 */         new NewJFrame().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   private void setIcon()
/*     */   {
/* 880 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("todo.png")));
/*     */   }
/*     */ }

/* Location:           /Users/benjamin/Desktop/Programming Projects/To-do-List-manager/To-do_list.jar
 * Qualified Name:     NewJFrame
 * JD-Core Version:    0.6.2
 */