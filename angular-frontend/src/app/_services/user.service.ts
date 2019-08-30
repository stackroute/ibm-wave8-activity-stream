import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { environment } from '@environments/environment';
import { User } from '@app/_models';

@Injectable({ providedIn: 'root' })
export class UserService {
    constructor(private http: HttpClient) { }

    getAll() {
        var url="http://localhost:8084/api/v1/users";
        return this.http.get<User[]>(url);
    }

    getById(id: number) {
        var url="http://localhost:8084/api/v1/user/${id}";
        return this.http.get(url);
    }

    register(user: User) {
        var url="http://localhost:8084/api/v1/user";
        return this.http.post(url, user);
    }

    update(user: User) {
        return this.http.put(`${environment.apiUrl}/users/${user.id}`, user);
    }

    delete(username: string) {
        var url="http://localhost:8084/api/v1/deleteUser" + "/" +username;
        return this.http.delete(url);
    }
}