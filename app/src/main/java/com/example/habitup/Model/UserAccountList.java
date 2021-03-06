package com.example.habitup.Model;

import java.util.ArrayList;

/**
 * Created by Ty on 2017-10-22.
 *
 * UserAccountList: container for UserAccounts, used to store AllUsers, FriendLists, FriendRequests
 * Implemented with an ArrayList
 *
 * Javadoc last updated 2017-11-13 by @gojeffcho
 */

public class UserAccountList {

    private ArrayList<UserAccount> userList;

    /**
     * Constructor: create new ArrayList
     */
    public UserAccountList() {
        userList = new ArrayList<UserAccount>();
    }

    /**
     * Get the number of UserAccounts in the UserAccountList
     * @return Int (number of elements in UserAccountList)
     */
    public int size() {
        return userList.size();
    }

    /**
     * Add a UserAccount to the list
     * @param userToAdd UserAccount
     * @return -1 if already in list, 0 if successfully added
     */
    public int add(UserAccount userToAdd) {

        if (this.contains(userToAdd)) {
            return -1;
        } else {
            userList.add(userToAdd);
            return 0;
        }
    }

    /**
     * Check whether UserAccountList contains a certain UserAccount
     * @param user UserAccount
     * @return True if contained; otherwise False
     */
    public Boolean contains(UserAccount user) {
        return userList.contains(user);
    }

}
