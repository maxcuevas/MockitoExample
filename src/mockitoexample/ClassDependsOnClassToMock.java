/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockitoexample;

/**
 *
 * @author max
 */
public class ClassDependsOnClassToMock {

    ClassToMock classToMock;

    public ClassDependsOnClassToMock(ClassToMock classToMock) {
        this.classToMock = classToMock;
    }

    public String printClassToMockString(int someDummyInteger) {
        return classToMock.newString(someDummyInteger);
    }

}
