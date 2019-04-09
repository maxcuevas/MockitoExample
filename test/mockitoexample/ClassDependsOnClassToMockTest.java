/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockitoexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author max
 */
@RunWith(MockitoJUnitRunner.class)
public class ClassDependsOnClassToMockTest {

    @Mock
    private ClassToMock mockClassToMock;

    private ClassDependsOnClassToMock subject;

    public ClassDependsOnClassToMockTest() {
    }

    @Before
    public void setUp() {
        subject = new ClassDependsOnClassToMock(mockClassToMock);
    }

    @Test
    public void printClassToMockString() {
        int dummyInteger = 1;
        String expected = "This string should print instead";

        when(mockClassToMock.newString(dummyInteger)).thenReturn(expected);

        String actual = subject.printClassToMockString(dummyInteger);

        Assert.assertEquals(expected, actual);
    }

}
