import java.io.*;
public interface UserInputRetriever <T> {

    T produceOutput (int selection) throws IllegalArguementException;

}