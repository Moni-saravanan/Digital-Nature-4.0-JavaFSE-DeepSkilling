// src/App.js
import React, { Component } from 'react';
import GuestPage from './components/guestPage';
import UserPage from './components/UserPage';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    const { isLoggedIn } = this.state;

    let content;
    if (isLoggedIn) {
      content = <UserPage />;
    } else {
      content = <GuestPage />;
    }

    return (
      <div style={{ textAlign: 'center', padding: '20px' }}>
        <h1>Flight Ticket Booking App</h1>
        <div style={{ marginBottom: '20px' }}>
          {isLoggedIn ? (
            <button onClick={this.handleLogout}>Logout</button>
          ) : (
            <button onClick={this.handleLogin}>Login</button>
          )}
        </div>
        {content}
      </div>
    );
  }
}

export default App;
