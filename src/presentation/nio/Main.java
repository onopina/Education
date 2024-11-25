package presentation.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

public class Main {
    public static void main(String[] args) {
        String str = "Some text";
        try(FileChannel channel = FileChannel.open(Paths.get("presentation.txt"), WRITE, READ, CREATE)){
            ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
            channel.write(buffer);
            channel.position(0);

            buffer = ByteBuffer.allocateDirect(10);
            int bytes;

            while((bytes = channel.read(buffer))>0){
                buffer.flip();
                while(buffer.hasRemaining()){
                    System.out.print((char) buffer.get());
                }

                buffer.clear();

            }

        } catch (IOException e){
            e.printStackTrace();
        }


//        ByteBuffer buffer = ByteBuffer.allocateDirect(10);
//        buffer.put("12345".getBytes());
//        buffer.flip();   //change from writing to reading
//        while ((buffer.hasRemaining())){
//            byte b = buffer.get();
//            System.out.println(b);
////            buffer.put("0".getBytes());
//        }



    }
}
