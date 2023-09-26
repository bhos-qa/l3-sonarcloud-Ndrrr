package org.example.permission;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermissionManagerTest {

    @Test
    void testGetMCurrentLevelName() {
        PermissionManager permissionManager = new PermissionManager();
        assertEquals("User", permissionManager.getMCurrentLevelName());
    }

    @Test
    void testSetMCurrentLevelName() {
        PermissionManager permissionManager = new PermissionManager();
        permissionManager.setMCurrentLevelName(PermissionLevel.DEVELOPER);
        assertEquals("Developer", permissionManager.getMCurrentLevelName());
    }

}
