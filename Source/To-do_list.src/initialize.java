/*    */ public class initialize
/*    */ {
/*    */   public static todo_object initialize(int input)
/*    */   {
/* 14 */     todo_object output = new todo_object();
/*    */ 
/* 20 */     String[] lists = new String[input];
/*    */     try {
/* 22 */       lists = tools.readfile(ToDoList.path + "Lists.txt", input);
/* 23 */       output.setTitle(lists[(input - 1)]);
/*    */     } catch (Exception e) {
/* 25 */       output.setTitle("Math");
/*    */     }
/*    */ 
/* 30 */     String file = ToDoList.path + "todo " + output.getTitle().toLowerCase() + ".txt";
/*    */     int linenum;
/*    */     try
/*    */     {
/* 33 */       linenum = tools.countLines(file);
/*    */     } catch (Exception e) {
/* 35 */       linenum = 0;
/*    */     }
/*    */ 
/* 38 */     output.setTotalTodo(linenum);
/*    */ 
/* 40 */     String[] data = new String[linenum];
/*    */ 
/* 42 */     data = tools.readfile(file, linenum);
/*    */ 
/* 46 */     String[] due = new String[linenum];
/* 47 */     String[] tasks = new String[linenum];
/* 48 */     String[] temp = new String[2];
/* 49 */     String tomorrow = tools.dateTomorrow();
/* 50 */     int duetomorrow = 0;
/*    */ 
/* 52 */     for (int i = 0; i < linenum; i++) {
/* 53 */       temp = tools.findcomma(data[i]);
/* 54 */       tasks[i] = temp[0];
/* 55 */       due[i] = temp[1];
/*    */ 
/* 59 */       if (temp[1].equals(tomorrow)) {
/* 60 */         duetomorrow++;
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 66 */     String[] todolist = new String[tasks.length];
/* 67 */     todolist = tools.setarray(tasks, due);
/*    */ 
/* 71 */     output.setTododue(due);
/* 72 */     output.setTodolist(tasks);
/* 73 */     output.setDuetomorrow(duetomorrow);
/* 74 */     output.setAlltodos(todolist);
/*    */ 
/* 79 */     return output;
/*    */   }
/*    */ }

/* Location:           /Users/benjamin/Desktop/Programming Projects/To-do-List-manager/To-do_list.jar
 * Qualified Name:     initialize
 * JD-Core Version:    0.6.2
 */