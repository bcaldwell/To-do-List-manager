/*     */ import java.awt.Container;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class Change_subjects extends JFrame
/*     */ {
/*     */   private JTextField input1;
/*     */   private JTextField input2;
/*     */   private JTextField input3;
/*     */   private JTextField input4;
/*     */   private JTextField input5;
/*     */   private JTextField input6;
/*     */   private JTextField input7;
/*     */   private JTextField input8;
/*     */   private JTextField input9;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JButton save_and_exit;
/*     */ 
/*     */   public Change_subjects()
/*     */   {
/*  20 */     initComponents();
/*  21 */     setIcon();
/*     */   }
/*     */ 
/*     */   private void initComponents()
/*     */   {
/*  33 */     this.jLabel1 = new JLabel();
/*  34 */     this.jLabel2 = new JLabel();
/*  35 */     this.save_and_exit = new JButton();
/*  36 */     this.input1 = new JTextField();
/*  37 */     this.input2 = new JTextField();
/*  38 */     this.input3 = new JTextField();
/*  39 */     this.input4 = new JTextField();
/*  40 */     this.input5 = new JTextField();
/*  41 */     this.input6 = new JTextField();
/*  42 */     this.input8 = new JTextField();
/*  43 */     this.input7 = new JTextField();
/*  44 */     this.input9 = new JTextField();
/*  45 */     this.jLabel3 = new JLabel();
/*  46 */     this.jLabel4 = new JLabel();
/*     */ 
/*  48 */     setDefaultCloseOperation(2);
/*  49 */     getContentPane().setLayout(new AbsoluteLayout());
/*     */ 
/*  51 */     this.jLabel1.setFont(new Font("Tahoma", 1, 14));
/*  52 */     this.jLabel1.setText("Change To-Do Lists");
/*  53 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(10, 0, 140, -1));
/*     */ 
/*  55 */     this.jLabel2.setText("Enter 'none' to remove list");
/*  56 */     getContentPane().add(this.jLabel2, new AbsoluteConstraints(10, 23, -1, -1));
/*     */ 
/*  58 */     this.save_and_exit.setText("Save and Exit");
/*  59 */     this.save_and_exit.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  61 */         Change_subjects.this.save_and_exitActionPerformed(evt);
/*     */       }
/*     */     });
/*  64 */     getContentPane().add(this.save_and_exit, new AbsoluteConstraints(10, 282, 140, -1));
/*     */ 
/*  66 */     this.input1.setText(ToDoList.main[0].getTitle());
/*  67 */     this.input1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  69 */         Change_subjects.this.input1ActionPerformed(evt);
/*     */       }
/*     */     });
/*  72 */     getContentPane().add(this.input1, new AbsoluteConstraints(10, 43, 140, -1));
/*     */ 
/*  74 */     this.input2.setText(ToDoList.main[1].getTitle());
/*  75 */     getContentPane().add(this.input2, new AbsoluteConstraints(10, 69, 140, -1));
/*     */ 
/*  77 */     this.input3.setText(ToDoList.main[2].getTitle());
/*  78 */     getContentPane().add(this.input3, new AbsoluteConstraints(10, 95, 140, -1));
/*     */ 
/*  80 */     this.input4.setText(ToDoList.main[3].getTitle());
/*  81 */     getContentPane().add(this.input4, new AbsoluteConstraints(10, 121, 140, -1));
/*     */ 
/*  83 */     this.input5.setText(ToDoList.main[4].getTitle());
/*  84 */     getContentPane().add(this.input5, new AbsoluteConstraints(10, 147, 140, -1));
/*     */ 
/*  86 */     this.input6.setText(ToDoList.main[5].getTitle());
/*  87 */     getContentPane().add(this.input6, new AbsoluteConstraints(10, 173, 140, -1));
/*     */ 
/*  89 */     this.input8.setText(ToDoList.main[7].getTitle());
/*  90 */     getContentPane().add(this.input8, new AbsoluteConstraints(10, 225, 140, -1));
/*     */ 
/*  92 */     this.input7.setText(ToDoList.main[6].getTitle());
/*  93 */     getContentPane().add(this.input7, new AbsoluteConstraints(10, 199, 140, -1));
/*     */ 
/*  95 */     this.input9.setText(ToDoList.main[8].getTitle());
/*  96 */     getContentPane().add(this.input9, new AbsoluteConstraints(10, 251, 140, -1));
/*     */ 
/*  98 */     this.jLabel3.setText(" ");
/*  99 */     getContentPane().add(this.jLabel3, new AbsoluteConstraints(10, 300, -1, -1));
/*     */ 
/* 101 */     this.jLabel4.setText(" ");
/* 102 */     getContentPane().add(this.jLabel4, new AbsoluteConstraints(130, 300, -1, -1));
/*     */ 
/* 104 */     pack();
/*     */   }
/*     */ 
/*     */   private void input1ActionPerformed(ActionEvent evt)
/*     */   {
/*     */   }
/*     */ 
/*     */   private void save_and_exitActionPerformed(ActionEvent evt) {
/* 112 */     ToDoList.main[0].setTitle(this.input1.getText());
/* 113 */     ToDoList.main[1].setTitle(this.input2.getText());
/* 114 */     ToDoList.main[2].setTitle(this.input3.getText());
/* 115 */     ToDoList.main[3].setTitle(this.input4.getText());
/* 116 */     ToDoList.main[4].setTitle(this.input5.getText());
/* 117 */     ToDoList.main[5].setTitle(this.input6.getText());
/* 118 */     ToDoList.main[6].setTitle(this.input7.getText());
/* 119 */     ToDoList.main[7].setTitle(this.input8.getText());
/* 120 */     ToDoList.main[8].setTitle(this.input9.getText());
/*     */ 
/* 124 */     dispose();
/*     */ 
/* 128 */     String filewrite = ToDoList.main[0].getTitle() + "\r\n" + ToDoList.main[1].getTitle() + "\r\n" + ToDoList.main[2].getTitle() + "\r\n" + ToDoList.main[3].getTitle() + "\r\n" + ToDoList.main[4].getTitle() + "\r\n" + ToDoList.main[5].getTitle() + "\r\n" + ToDoList.main[6].getTitle() + "\r\n" + ToDoList.main[7].getTitle() + "\r\n" + ToDoList.main[8].getTitle();
/*     */ 
/* 134 */     tools.writefile(filewrite, ToDoList.path + "Lists.txt");
/* 135 */     NewJFrame n = new NewJFrame();
/* 136 */     n.refresh();
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 153 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 154 */         if ("Nimbus".equals(info.getName())) {
/* 155 */           UIManager.setLookAndFeel(info.getClassName());
/* 156 */           break;
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (ClassNotFoundException ex)
/*     */     {
/* 162 */       Logger.getLogger(Change_subjects.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     catch (InstantiationException ex) {
/* 165 */       Logger.getLogger(Change_subjects.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     catch (IllegalAccessException ex) {
/* 168 */       Logger.getLogger(Change_subjects.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     catch (UnsupportedLookAndFeelException ex) {
/* 171 */       Logger.getLogger(Change_subjects.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */ 
/* 177 */     EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 179 */         new Change_subjects().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   private void setIcon() {
/* 185 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("todo.png")));
/*     */   }
/*     */ }

/* Location:           /Users/benjamin/Desktop/Programming Projects/To-do-List-manager/To-do_list.jar
 * Qualified Name:     Change_subjects
 * JD-Core Version:    0.6.2
 */