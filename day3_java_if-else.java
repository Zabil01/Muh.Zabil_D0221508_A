import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 ​
public​ ​class​ ​day3_java_if_else​ { 
 ​    ​private​ ​static​ ​final​ ​Scanner​ scanner ​=​ ​new​ ​Scanner​(​System​.​in); 
  
 ​    ​public​ ​static​ ​void​ ​main​(​String​[] ​args​) { 
 ​        ​int​ ​N​ ​=​ scanner​.​nextInt(); 
 ​        scanner​.​skip(​"​(​\r\n​|[​\n\r\u​2028​\u​2029​\u​0085])?​"​); 
 ​        ​if​(​N​%​2​ ​!=​ ​0​){ 
 ​            ​System​.​out​.​println(​"​Weird​"​); 
 ​        }​else​ ​if​ (​N​ ​>=​ ​2​ ​&&​ ​N<=​5​){ 
 ​            ​System​.​out​.​println(​"​Not Weird​"​); 
 ​        }​else​ ​if​ (​N​ ​>=​ ​6​ ​&&​ ​N<=​20​){ 
 ​            ​System​.​out​.​println(​"​Weird​"​); 
 ​        }​else​ ​if​ (​N​ ​>​20​){ 
 ​            ​System​.​out​.​println(​"​Not Weird​"​); 
 ​        } 
 ​    } 
 ​}