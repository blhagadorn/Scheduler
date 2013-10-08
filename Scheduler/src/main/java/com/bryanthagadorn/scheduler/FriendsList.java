package com.bryanthagadorn.scheduler;

/**
 * Created by Bryant on 10/8/13.
 */
public class FriendsList {
    Friend[] friends;
    int friendCount = 0;

    void addFriend(String name, String phoneNumber){
        friends[friendCount] = new Friend(name,phoneNumber);
        friendCount+=1;
    }

    void deleteFriend(String phoneNumber){
        for(int i = 0; i<friendCount;i++){
            if(friends[i].phoneNumber.contentEquals(phoneNumber)){
                friends[i] = null;
                friendCount=-1;
            }
        }
    }

    public String[] getNames(){
        String[] names = null;
        for(int i=0; i<friends.length;i++){
            names[i] = String.valueOf(friends[i]);
        }
        return names;
    }
}

