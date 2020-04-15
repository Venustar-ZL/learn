package stringTest.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Hashtable;

/**
 * @ClassName:
 * @Description:
 * @Date: 2020-04-07 16:28
 * @Author: ZhangLei
 * version: 1.0
 **/
public class UserCache {

    private static UserCache cache;
    private Hashtable<String, UserRef> userRefs;
    private ReferenceQueue<User> q;


    private class UserRef extends SoftReference<User> {
        private String key = "";
        public UserRef(User user, ReferenceQueue<User> q) {
            super(user, q);
            key = user.getId();
        }
    }

    public getCache() {}

}
