package seminar4.controller;

import seminar4.model.User;

public interface UserController {
    <T extends User> User create(T user);
}