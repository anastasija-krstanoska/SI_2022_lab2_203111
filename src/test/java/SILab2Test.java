import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SILab2Test {

    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementTest() {
        List<String> list = new ArrayList<>(); //prazna


        List<String> resList = new ArrayList<>();
        resList.add("0");
        resList.add("#");
        resList.add("0");


        assertEquals(list, SILab2.function(resList));

        List<String> exList = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("#");


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList));

        List<String> exList2 = new ArrayList<>();


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList2));
    }

    @Test
    void everyBranchTest() {
        List<String> list = new ArrayList<>();

        List<String> resList = new ArrayList<>();
        resList.add("0");
        resList.add("#");
        resList.add("0");

         assertEquals(list, SILab2.function(resList));

        List<String> exList = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("#");


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList));

        List<String> exList2 = new ArrayList<>();


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList2));

    }


}