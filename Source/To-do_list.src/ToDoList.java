/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ 
/*    */ public class ToDoList
/*    */ {
/* 22 */   public static todo_object[] main = new todo_object[9];
/* 23 */   public static String todotag = " ";
/* 24 */   public static int current = 0;
/* 25 */   public static String path = "ToDo//";
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 34 */     main[0] = new todo_object();
/* 35 */     main[1] = new todo_object();
/* 36 */     main[2] = new todo_object();
/* 37 */     main[3] = new todo_object();
/* 38 */     main[4] = new todo_object();
/* 39 */     main[5] = new todo_object();
/* 40 */     main[6] = new todo_object();
/* 41 */     main[7] = new todo_object();
/* 42 */     main[8] = new todo_object();
/*    */ 
/* 44 */     File f = new File(path + "Lists.txt");
/* 45 */     if ((f.exists()) && (!f.isDirectory())) {
/* 46 */       System.out.println("file");
/*    */     } else {
/* 48 */       File dir = new File("ToDo");
/* 49 */       dir.mkdir();
/* 50 */       PrintWriter writer = null;
/*    */       try {
/* 52 */         System.out.println("no file");
/* 53 */         writer = new PrintWriter(path + "Lists.txt", "UTF-8");
/* 54 */         for (int a = 0; a < 9; a++) {
/* 55 */           writer.println("none");
/*    */         }
/* 57 */         writer.close();
/*    */       } catch (FileNotFoundException ex) {
/* 59 */         Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
/*    */       } catch (UnsupportedEncodingException ex) {
/* 61 */         Logger.getLogger(ToDoList.class.getName()).log(Level.SEVERE, null, ex);
/*    */       } finally {
/* 63 */         writer.close();
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 68 */     for (int i = 0; i < 9; i++) {
/* 69 */       main[i] = initialize.initialize(i + 1);
/*    */     }
/*    */ 
/* 73 */     NewJFrame s = new NewJFrame();
/* 74 */     s.setVisible(true);
/*    */   }
/*    */ }

/* Location:           /Users/benjamin/Desktop/Programming Projects/To-do-List-manager/To-do_list.jar
 * Qualified Name:     ToDoList
 * JD-Core Version:    0.6.2
 */