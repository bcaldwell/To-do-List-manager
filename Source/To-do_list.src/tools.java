/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.LineNumberReader;
/*     */ import java.io.PrintStream;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ public class tools
/*     */ {
/*     */   public static void showIt(String inStr)
/*     */   {
/*  23 */     JOptionPane.showMessageDialog(null, inStr);
/*     */   }
/*     */ 
/*     */   public static String getit(String inStr)
/*     */   {
/*  29 */     String answerStr = JOptionPane.showInputDialog(null, inStr);
/*  30 */     return answerStr;
/*     */   }
/*     */ 
/*     */   public static void error(String inStr) {
/*  34 */     JOptionPane.showMessageDialog(null, inStr, "Error", 0);
/*     */   }
/*     */ 
/*     */   public static boolean dateright(String month, String dayin, String yearin)
/*     */   {
/*     */     int day;
/*     */     try
/*     */     {
/*  43 */       day = Integer.parseInt(dayin);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  47 */       return false;
/*     */     }
/*     */     int year;
/*     */     try {
/*  51 */       year = Integer.parseInt(yearin);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  55 */       return false;
/*     */     }
/*     */ 
/*  59 */     if (("January".equals(month)) && (day > 31)) {
/*  60 */       return false;
/*     */     }
/*     */ 
/*  63 */     if (year % 4 == 0) {
/*  64 */       if (("Febuary".equals(month)) && (day > 29)) {
/*  65 */         return false;
/*     */       }
/*     */     }
/*  68 */     else if (("Febuary".equals(month)) && (day > 28)) {
/*  69 */       return false;
/*     */     }
/*     */ 
/*  72 */     if (("March".equals(month)) && (day > 31)) {
/*  73 */       return false;
/*     */     }
/*  75 */     if (("April".equals(month)) && (day > 30)) {
/*  76 */       return false;
/*     */     }
/*  78 */     if (("May".equals(month)) && (day > 31)) {
/*  79 */       return false;
/*     */     }
/*  81 */     if (("June".equals(month)) && (day > 30)) {
/*  82 */       return false;
/*     */     }
/*  84 */     if (("July".equals(month)) && (day > 31)) {
/*  85 */       return false;
/*     */     }
/*  87 */     if (("August".equals(month)) && (day > 31)) {
/*  88 */       return false;
/*     */     }
/*  90 */     if (("September".equals(month)) && (day > 30)) {
/*  91 */       return false;
/*     */     }
/*  93 */     if (("October".equals(month)) && (day > 31)) {
/*  94 */       return false;
/*     */     }
/*  96 */     if (("Novemeber".equals(month)) && (day > 31)) {
/*  97 */       return false;
/*     */     }
/*  99 */     if (("December".equals(month)) && (day > 31)) {
/* 100 */       return false;
/*     */     }
/* 102 */     return true;
/*     */   }
/*     */ 
/*     */   public static String[] findcomma(String inString) {
/* 106 */     String[] out = { " ", " " };
/* 107 */     for (int i = 0; i < inString.length(); i++) {
/* 108 */       char aChar = inString.charAt(i);
/* 109 */       if (aChar == ',')
/*     */       {
/* 111 */         out[0] = inString.substring(0, i);
/* 112 */         out[1] = inString.substring(i + 1, inString.length());
/*     */ 
/* 114 */         return out;
/*     */       }
/*     */     }
/*     */ 
/* 118 */     return out;
/*     */   }
/*     */ 
/*     */   public static boolean doublecheck(String inStr) {
/* 122 */     boolean outbool = true;
/* 123 */     double temp = 0.0D;
/*     */     try
/*     */     {
/* 126 */       temp = Double.parseDouble(inStr);
/*     */     } catch (Exception e) {
/* 128 */       outbool = false;
/*     */     }
/* 130 */     return outbool;
/*     */   }
/*     */ 
/*     */   public static boolean intcheck(String inStr) {
/* 134 */     boolean outbool = true;
/* 135 */     int temp = 0;
/*     */     try
/*     */     {
/* 138 */       temp = Integer.parseInt(inStr);
/*     */     } catch (Exception e) {
/* 140 */       outbool = false;
/*     */     }
/* 142 */     return outbool;
/*     */   }
/*     */ 
/*     */   public static String dateTomorrow() {
/* 146 */     Date dNow = new Date();
/* 147 */     SimpleDateFormat ft = new SimpleDateFormat("MM.dd.yyyy");
/*     */ 
/* 149 */     String Datetoday = ft.format(dNow);
/* 150 */     int day = Integer.parseInt(Datetoday.substring(3, 5));
/* 151 */     day++;
/* 152 */     String dayStr = String.format("%02d", new Object[] { Integer.valueOf(day) });
/* 153 */     String datetomorrow = Datetoday.substring(0, 2) + "." + dayStr + "." + Datetoday.substring(6, 10);
/*     */ 
/* 157 */     return dateconvert(datetomorrow);
/*     */   }
/*     */ 
/*     */   public static String dateconvert(String instr)
/*     */   {
/* 162 */     Calendar c = Calendar.getInstance();
/*     */ 
/* 164 */     String dayofweek = "";
/*     */     try {
/* 166 */       Date datein = new SimpleDateFormat("MM.dd.yyyy").parse(instr);
/* 167 */       c.setTime(datein);
/* 168 */       int dayOfWeek = c.get(7);
/*     */ 
/* 171 */       if (dayOfWeek == 1) {
/* 172 */         dayofweek = "Sunday";
/*     */       }
/* 174 */       if (dayOfWeek == 2) {
/* 175 */         dayofweek = "Monday";
/*     */       }
/* 177 */       if (dayOfWeek == 3) {
/* 178 */         dayofweek = "Tuesday";
/*     */       }
/* 180 */       if (dayOfWeek == 4) {
/* 181 */         dayofweek = "Wednesday";
/*     */       }
/* 183 */       if (dayOfWeek == 5) {
/* 184 */         dayofweek = "Thursday";
/*     */       }
/* 186 */       if (dayOfWeek == 6) {
/* 187 */         dayofweek = "Friday";
/*     */       }
/* 189 */       if (dayOfWeek == 7) {
/* 190 */         dayofweek = "Saturday";
/*     */       }
/*     */ 
/*     */     }
/*     */     catch (ParseException ex)
/*     */     {
/*     */     }
/*     */ 
/* 199 */     String month = " ";
/*     */ 
/* 201 */     if ("01".equals(instr.substring(0, 2))) {
/* 202 */       month = "January";
/*     */     }
/* 204 */     if ("02".equals(instr.substring(0, 2))) {
/* 205 */       month = "Febuary";
/*     */     }
/* 207 */     if ("03".equals(instr.substring(0, 2))) {
/* 208 */       month = "March";
/*     */     }
/* 210 */     if ("04".equals(instr.substring(0, 2))) {
/* 211 */       month = "April";
/*     */     }
/* 213 */     if ("05".equals(instr.substring(0, 2))) {
/* 214 */       month = "May";
/*     */     }
/* 216 */     if ("06".equals(instr.substring(0, 2))) {
/* 217 */       month = "June";
/*     */     }
/* 219 */     if ("07".equals(instr.substring(0, 2))) {
/* 220 */       month = "July";
/*     */     }
/* 222 */     if ("08".equals(instr.substring(0, 2))) {
/* 223 */       month = "Auguest";
/*     */     }
/* 225 */     if ("09".equals(instr.substring(0, 2))) {
/* 226 */       month = "September";
/*     */     }
/* 228 */     if ("10".equals(instr.substring(0, 2))) {
/* 229 */       month = "October";
/*     */     }
/* 231 */     if ("11".equals(instr.substring(0, 2))) {
/* 232 */       month = "November";
/*     */     }
/* 234 */     if ("12".equals(instr.substring(0, 2))) {
/* 235 */       month = "December";
/*     */     }
/*     */ 
/* 238 */     String dateout = dayofweek + " " + month + " " + instr.substring(3, 5);
/*     */ 
/* 241 */     return dateout;
/*     */   }
/*     */ 
/*     */   public static int countLines(String input) throws IOException {
/* 245 */     File aFile = new File(input);
/* 246 */     LineNumberReader reader = null;
/*     */     try {
/* 248 */       reader = new LineNumberReader(new FileReader(aFile));
/* 249 */       while (reader.readLine() != null);
/* 250 */       return reader.getLineNumber();
/*     */     } catch (Exception ex) {
/* 252 */       return 0;
/*     */     } finally {
/* 254 */       if (reader != null)
/* 255 */         reader.close();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String[] readfile(String inputfile, int length)
/*     */   {
/* 261 */     int loopnum = 0;
/*     */ 
/* 263 */     File aFile = new File(inputfile);
/* 264 */     String[] output = new String[length];
/*     */     try
/*     */     {
/* 271 */       FileInputStream fstream = new FileInputStream(aFile);
/*     */ 
/* 273 */       DataInputStream in = new DataInputStream(fstream);
/* 274 */       BufferedReader br = new BufferedReader(new InputStreamReader(in));
/*     */       String strLine;
/* 278 */       while (((strLine = br.readLine()) != null) && (loopnum + 1 <= length))
/*     */       {
/* 280 */         output[loopnum] = strLine;
/* 281 */         loopnum++;
/*     */       }
/*     */ 
/* 284 */       in.close();
/*     */     } catch (Exception e) {
/* 286 */       System.err.println("Error: " + e.getMessage());
/*     */     }
/* 288 */     return output;
/*     */   }
/*     */ 
/*     */   public static void appendfile(String input, String infile)
/*     */   {
/*     */     try {
/* 294 */       String data = "\r\n" + input;
/*     */ 
/* 296 */       File file = new File(infile);
/*     */ 
/* 299 */       if (!file.exists()) {
/* 300 */         file.createNewFile();
/* 301 */         data = input;
/*     */       }
/*     */ 
/* 305 */       FileWriter fileWriter = new FileWriter(file, true);
/* 306 */       BufferedWriter bufferFileWriter = new BufferedWriter(fileWriter);
/* 307 */       fileWriter.append(data);
/* 308 */       bufferFileWriter.close();
/*     */     }
/*     */     catch (IOException e) {
/* 311 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void writefile(String input, String infile)
/*     */   {
/*     */     try {
/* 318 */       File file = new File(infile);
/* 319 */       input = input + "\r\n";
/*     */ 
/* 322 */       if (!file.exists()) {
/* 323 */         file.createNewFile();
/*     */       }
/*     */ 
/* 327 */       FileWriter fileWriter = new FileWriter(file, false);
/* 328 */       BufferedWriter bufferFileWriter = new BufferedWriter(fileWriter);
/* 329 */       fileWriter.write(input);
/* 330 */       bufferFileWriter.close();
/*     */     }
/*     */     catch (IOException e) {
/* 333 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String[] setarray(String[] todo, String[] due) {
/* 338 */     String[] output = new String[todo.length];
/*     */ 
/* 341 */     for (int i = 0; i < todo.length; i++)
/*     */     {
/* 343 */       int textlength = 30 - todo[i].length();
/* 344 */       String middle = "";
/*     */ 
/* 346 */       for (int c = 1; c <= textlength; c++) {
/* 347 */         middle = middle + " ";
/*     */       }
/*     */ 
/* 350 */       output[i] = (todo[i] + middle + due[i]);
/*     */     }
/*     */ 
/* 356 */     return output;
/*     */   }
/*     */ 
/*     */   public static String daytonum(String in) {
/* 360 */     if ("January".equals(in)) {
/* 361 */       return "01";
/*     */     }
/* 363 */     if ("Febuary".equals(in)) {
/* 364 */       return "02";
/*     */     }
/* 366 */     if ("March".equals(in)) {
/* 367 */       return "03";
/*     */     }
/* 369 */     if ("April".equals(in)) {
/* 370 */       return "04";
/*     */     }
/* 372 */     if ("May".equals(in)) {
/* 373 */       return "05";
/*     */     }
/* 375 */     if ("June".equals(in)) {
/* 376 */       return "06";
/*     */     }
/* 378 */     if ("July".equals(in)) {
/* 379 */       return "07";
/*     */     }
/* 381 */     if ("August".equals(in)) {
/* 382 */       return "08";
/*     */     }
/* 384 */     if ("September".equals(in)) {
/* 385 */       return "09";
/*     */     }
/* 387 */     if ("October".equals(in)) {
/* 388 */       return "10";
/*     */     }
/* 390 */     if ("Noveember".equals(in)) {
/* 391 */       return "11";
/*     */     }
/* 393 */     if ("December".equals(in)) {
/* 394 */       return "12";
/*     */     }
/* 396 */     return "0";
/*     */   }
/*     */ }

/* Location:           /Users/benjamin/Desktop/Programming Projects/To-do-List-manager/To-do_list.jar
 * Qualified Name:     tools
 * JD-Core Version:    0.6.2
 */