package org.example.permission;

public class PermissionManager {

    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getMCurrentLevelName() {
        return mCurrentLevel.getName();
    }

    public void setMCurrentLevelName(PermissionLevel permissionLevel) {
        mCurrentLevel = permissionLevel;
    }

}