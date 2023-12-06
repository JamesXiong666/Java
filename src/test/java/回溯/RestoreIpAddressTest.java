package 回溯;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestoreIpAddressTest {
    @Test
    public void testRestoreIpAddresses() {
        RestoreIpAddress restoreIpAddress = new RestoreIpAddress();

        // Test case 1: valid input
        String input1 = "25525511135";
        List<String> expected1 = Arrays.asList("255.255.11.135");
        Assertions.assertEquals(expected1, restoreIpAddress.restoreIpAddresses(input1));


    }

}