package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();


    @Test
    public void testRegisterInvalidForUnderagePerson() {
        Person person = new Person("Isabella", 1015466, 16, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void testRegisterInvalidForInvalidAgePerson() {
        Person person = new Person("Juan", 101632, -10, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void testRegisterInvalidForDeadPerson() {
        Person person = new Person("Mane", 987541, 80, Gender.UNIDENTIFIED, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void testRegisterInvalidForDuplicatePerson() {
        Person person = new Person("Camilo", 521847, 80, Gender.MALE, true);
        registry.registerVoter(person);
        Person person2 = new Person("Juan", 521847, 80, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person2);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

    @Test
    public void testRegisterValidPerson() {
        Person person = new Person("Camilo", 521847, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
}