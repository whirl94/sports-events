import { FormsModule } from '@angular/forms';
import { AuthGuard } from './auth.guard';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { APP_INITIALIZER, NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeNavComponent } from './home-nav/home-nav.component';
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import { initializer } from './initializer.service';
import { environment as env} from '../environments/environment';
import { RouterModule, Routes } from '@angular/router';
import { PastEventsComponent } from './past-events/past-events.component';
import { EditEventsComponent } from './edit-events/edit-events.component';
import { EditUsersComponent } from './edit-users/edit-users.component';
import { ProfileComponent } from './profile/profile.component';
import { LeaderboardComponent } from './leaderboard/leaderboard.component';
import { HomeComponent } from './home/home.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeNavComponent,
    PastEventsComponent,
    EditEventsComponent,
    EditUsersComponent,
    ProfileComponent,
    LeaderboardComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    KeycloakAngularModule,
    // RouterModule.forRoot(appRoutes),
    HttpClientModule,
    FormsModule
  ],
  providers: [
    {
      provide: APP_INITIALIZER,
      useFactory: initializer,
      deps: [KeycloakService],
      multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

function initializeKeycloak(keycloak: KeycloakService) {
  return () =>
    keycloak.init({
      config: {
        url: env.keycloak.issuer,
        realm: env.keycloak.realm,
        clientId: env.keycloak.clientId,
      },
      loadUserProfileAtStartUp: true,
      initOptions: {
        onLoad: 'login-required'
      },
      bearerExcludedUrls: []
    });
}

