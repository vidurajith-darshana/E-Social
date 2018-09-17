import React, { Component } from 'react';
import './App.css';
import Routes from "./Routes/Routes";
import Backdrop from "./components/Backdrop/Backdrop";

class App extends Component {
  render() {
    return (
      <div>
        <Backdrop/>
        <Routes/>
      </div>
    );
  }
}

export default App;
