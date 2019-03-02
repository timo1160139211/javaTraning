package site.gaoyisheng.Converter;

import java.io.BufferedReader;
import java.io.Reader;

public class InputStreamToString {
	
	//无外部引入库版将 is 转换为string
	@SuppressWarnings("resource")
	static String convertStreamToString(java.io.InputStream is) {
		  java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A"); 
		  return s.hasNext() ? s.next() : "";
	}

	
	
	//Using IOUtils.toString (Apache Utils)
	String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
	
	
	//Using CharStreams (Guava)
	String result = CharStreams.toString(new InputStreamReader(
	      inputStream, Charsets.UTF_8));
	
	
	//Using Scanner (JDK)
	Scanner s = new Scanner(inputStream).useDelimiter("\\A");
	String result = s.hasNext() ? s.next() : "";
	
	
	
	//Using Stream API (Java 8). Warning: This solution converts different line breaks (like \r\n) to  \n.
	String result = new BufferedReader(new InputStreamReader(inputStream))
	  .lines().collect(Collectors.joining("\n"));
	
	
	
	//Using parallel Stream API (Java 8). Warning: This solution converts different line breaks (like \r\n) to \n.
	String result = new BufferedReader(new InputStreamReader(inputStream)).lines()
	   .parallel().collect(Collectors.joining("\n"));
	
	
	
	
	//Using InputStreamReader and StringBuilder (JDK)
	final int bufferSize = 1024;
	final char[] buffer = new char[bufferSize];
	final StringBuilder out = new StringBuilder();
	Reader in = new InputStreamReader(inputStream, "UTF-8");
	for (; ; ) {
	    int rsz = in.read(buffer, 0, buffer.length);
	    if (rsz < 0)
	        break;
	    out.append(buffer, 0, rsz);
	}
	return out.toString();
	
	
	//Using StringWriter and IOUtils.copy (Apache Commons)
	StringWriter writer = new StringWriter();
	IOUtils.copy(inputStream, writer, "UTF-8");
	return writer.toString();
	
	
	
	//Using ByteArrayOutputStream and inputStream.read (JDK)
	ByteArrayOutputStream result = new ByteArrayOutputStream();
	byte[] buffer = new byte[1024];
	int length;
	while ((length = inputStream.read(buffer)) != -1) {
	    result.write(buffer, 0, length);
	}
	// StandardCharsets.UTF_8.name() > JDK 7
	return result.toString("UTF-8");
	
	
	//Using BufferedReader (JDK). Warning: This solution converts different line breaks (like \n\r) to line.separator system property (for example, in Windows to "\r\n").
	String newLine = System.getProperty("line.separator");
	BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	StringBuilder result = new StringBuilder();
	boolean flag = false;
	for (String line; (line = reader.readLine()) != null; ) {
	    result.append(flag? newLine: "").append(line);
	    flag = true;
	}
	return result.toString();
	
	
	//Using BufferedInputStream and ByteArrayOutputStream (JDK)
	BufferedInputStream bis = new BufferedInputStream(inputStream);
	ByteArrayOutputStream buf = new ByteArrayOutputStream();
	int result = bis.read();
	while(result != -1) {
	    buf.write((byte) result);
	    result = bis.read();
	}
	// StandardCharsets.UTF_8.name() > JDK 7
	return buf.toString("UTF-8");
	
	
	//Using inputStream.read() and StringBuilder (JDK). Warning: This solution has problems with Unicode, for example with Russian text (works correctly only with non-Unicode text)
	int ch;
	StringBuilder sb = new StringBuilder();
	while((ch = inputStream.read()) != -1)
	    sb.append((char)ch);
		reset();
	return sb.toString();
}
