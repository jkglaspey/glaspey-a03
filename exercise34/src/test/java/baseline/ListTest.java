package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest extends List {

    //test the constructor
    @Test
    void test_List() {

        List test = new List(5);
        test.setName("John Smith",0);
        test.setName("Jackie Jackson",1);
        test.setName("Chris Jones",2);
        test.setName("Amanda Cullen",3);
        test.setName("Jeremy Goodwin",4);

        //test size
        assertEquals(5,test.getSize());

        //create a list of equal names
        String[] names = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};

        //test each name (while also comparing arrays)
        for(int i = 0; i < 5; i++) {
            assertEquals(names[i],test.getListOfNames()[i]);
        }
    }

    //test getName method (we tested the other get methods already)
    @Test
    void test_getName() {
        List test = new List(2);
        test.setName("John Smith",0);
        test.setName("Jackie Jackson",1);

        assertEquals("Jackie Jackson",test.getName(1));
    }

    //test setSize method
    @Test
    void test_setSize() {
        List test = new List(2);
        test.setSize(100);

        assertEquals(100,test.getSize());
    }

    //test setNames method
    @Test
    void test_setNames() {
        List test = new List(2);
        String[] names = {"One","Two"};
        test.setNames(names);

        assertEquals("One",test.getName(0));
        assertEquals("Two",test.getName(1));
    }

    //test removeName method for a list of names with no duplicates
    //note: the return type is void, but the object's instance values change
    @Test
    void test_removeNameNormal() {
        //test a normal list of names
        List test = new List(5);
        test.setName("John Smith",0);
        test.setName("Jackie Jackson",1);
        test.setName("Chris Jones",2);
        test.setName("Amanda Cullen",3);
        test.setName("Jeremy Goodwin",4);

        removeName(test,"Chris Jones");

        //test size
        assertEquals(4,test.getSize());

        //create a list of equal names
        String[] names = {"John Smith","Jackie Jackson","Amanda Cullen","Jeremy Goodwin"};

        //test each name (while also comparing arrays)
        for(int i = 0; i < 4; i++) {
            assertEquals(names[i],test.getListOfNames()[i]);
        }
    }

    //test removeName method for a list of names with a duplicate
    @Test
    void test_removeNameDuplicate() {
        //test a normal list of names
        List test = new List(5);
        test.setName("Chris Jones",0);
        test.setName("Jackie Jackson",1);
        test.setName("Chris Jones",2);
        test.setName("Amanda Cullen",3);
        test.setName("Jeremy Goodwin",4);

        removeName(test,"Chris Jones");

        //test size
        assertEquals(3,test.getSize());

        //create a list of equal names
        String[] names = {"Jackie Jackson","Amanda Cullen","Jeremy Goodwin"};

        //test each name (while also comparing arrays)
        for(int i = 0; i < 3; i++) {
            assertEquals(names[i],test.getListOfNames()[i]);
        }
    }

    //test removeName method for a list of names with no duplicates
    @Test
    void test_removeNameNotIncluded() {
        //test a normal list of names
        List test = new List(5);
        test.setName("John Smith",0);
        test.setName("Jackie Jackson",1);
        test.setName("Chris Jones",2);
        test.setName("Amanda Cullen",3);
        test.setName("Jeremy Goodwin",4);

        removeName(test,"Bob");

        //test size
        assertEquals(5,test.getSize());

        //create a list of equal names
        String[] names = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};

        //test each name (while also comparing arrays)
        for(int i = 0; i < 5; i++) {
            assertEquals(names[i],test.getListOfNames()[i]);
        }
    }

    //test removeName method for a list of names where all names are the same
    @Test
    void test_removeNameAllTheSame() {
        //test a normal list of names
        List test = new List(5);
        test.setName("Chris Jones",0);
        test.setName("Chris Jones",1);
        test.setName("Chris Jones",2);
        test.setName("Chris Jones",3);
        test.setName("Chris Jones",4);

        removeName(test,"Chris Jones");

        //test size
        assertEquals(0,test.getSize());
    }
}