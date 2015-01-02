/*     */ import java.awt.Container;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.File;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.AbstractListModel;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.LayoutStyle.ComponentPlacement;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class Show_todo extends JFrame
/*     */ {
/*     */   private JButton delete;
/*     */   private JButton jButton2;
/*     */   private JLabel jLabel1;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JList list;
/*     */ 
/*     */   public Show_todo()
/*     */   {
/*  20 */     initComponents();
/*  21 */     setIcon();
/*     */   }
/*     */ 
/*     */   private void initComponents()
/*     */   {
/*  33 */     this.jScrollPane1 = new JScrollPane();
/*  34 */     this.list = new JList();
/*  35 */     this.jLabel1 = new JLabel();
/*  36 */     this.delete = new JButton();
/*  37 */     this.jButton2 = new JButton();
/*     */ 
/*  39 */     setDefaultCloseOperation(2);
/*     */ 
/*  41 */     this.list.setFont(new Font("Tahoma", 0, 14));
/*  42 */     this.list.setModel(new AbstractListModel() {
/*  43 */       String[] strings = ToDoList.main[ToDoList.current].getAlltodos();
/*     */ 
/*  44 */       public int getSize() { return this.strings.length; } 
/*  45 */       public Object getElementAt(int i) { return this.strings[i]; }
/*     */ 
/*     */     });
/*  47 */     this.jScrollPane1.setViewportView(this.list);
/*     */ 
/*  49 */     this.jLabel1.setFont(new Font("Tahoma", 1, 18));
/*  50 */     this.jLabel1.setText(ToDoList.todotag);
/*     */ 
/*  52 */     this.delete.setText("Delete Selected and Exit");
/*  53 */     this.delete.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  55 */         Show_todo.this.deleteActionPerformed(evt);
/*     */       }
/*     */     });
/*  59 */     this.jButton2.setText("Exit");
/*  60 */     this.jButton2.setToolTipText("");
/*  61 */     this.jButton2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  63 */         Show_todo.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */     });
/*  67 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  68 */     getContentPane().setLayout(layout);
/*  69 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 164, -2).addContainerGap(-1, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.delete).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton2)).addGroup(layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jScrollPane1, -2, 357, -2))).addGap(20, 20, 20)))));
/*     */ 
/*  88 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel1, -1, 36, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane1, -2, 219, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.delete).addComponent(this.jButton2)).addGap(5, 5, 5)));
/*     */ 
/* 101 */     pack();
/*     */   }
/*     */ 
/*     */   private void deleteActionPerformed(ActionEvent evt)
/*     */   {
/* 106 */     if (this.list.getSelectedIndex() == -1) {
/* 107 */       tools.error("Please select a task to delete");
/*     */     } else {
/* 109 */       String[] temp = new String[ToDoList.main[ToDoList.current].getTodolist().length];
/* 110 */       String[] due = new String[ToDoList.main[ToDoList.current].getTodolist().length];
/* 111 */       temp = ToDoList.main[ToDoList.current].getTodolist();
/* 112 */       due = ToDoList.main[ToDoList.current].getTododue();
/* 113 */       temp[this.list.getSelectedIndex()] = " ";
/* 114 */       ToDoList.main[ToDoList.current].setTodolist(temp);
/*     */ 
/* 117 */       boolean writenonce = false;
/* 118 */       String writetofile = "";
/* 119 */       String file = ToDoList.path + "todo " + ToDoList.todotag.toLowerCase() + ".txt";
/* 120 */       for (int i = 0; i < temp.length; i++) {
/* 121 */         writetofile = temp[i] + "," + due[i];
/* 122 */         if (temp.length == 1) {
/* 123 */           if (temp[i] == " ") {
/* 124 */             File filenow = new File(file);
/* 125 */             filenow.delete();
/*     */           }
/*     */         }
/* 128 */         else if (!" ".equals(temp[i]))
/*     */         {
/* 130 */           if (!writenonce)
/*     */           {
/* 132 */             tools.writefile(writetofile, file);
/* 133 */             writenonce = true;
/*     */           }
/*     */           else {
/* 136 */             tools.appendfile(writetofile, file);
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 144 */       NewJFrame n = new NewJFrame();
/* 145 */       dispose();
/* 146 */       n.refresh();
/*     */     }
/*     */   }
/*     */ 
/*     */   private void jButton2ActionPerformed(ActionEvent evt)
/*     */   {
/* 152 */     NewJFrame n = new NewJFrame();
/* 153 */     dispose();
/* 154 */     n.refresh();
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 167 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
/* 168 */         if ("Nimbus".equals(info.getName())) {
/* 169 */           UIManager.setLookAndFeel(info.getClassName());
/* 170 */           break;
/*     */         }
/*     */     }
/*     */     catch (ClassNotFoundException ex) {
/* 174 */       Logger.getLogger(Show_todo.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 176 */       Logger.getLogger(Show_todo.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 178 */       Logger.getLogger(Show_todo.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (UnsupportedLookAndFeelException ex) {
/* 180 */       Logger.getLogger(Show_todo.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */ 
/* 187 */     EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 189 */         new Show_todo().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   private void setIcon() {
/* 195 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("todo.png")));
/*     */   }
/*     */ }

/* Location:           /Users/benjamin/Desktop/Programming Projects/To-do-List-manager/To-do_list.jar
 * Qualified Name:     Show_todo
 * JD-Core Version:    0.6.2
 */