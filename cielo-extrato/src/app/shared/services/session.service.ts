import { Injectable } from '@angular/core';
@Injectable({
  providedIn: 'root',
})
export class SessionService {
  getToken(): string {
    return sessionStorage.getItem('token-autenticacao') ? sessionStorage.getItem('token-autenticacao') : '';
  }
}
