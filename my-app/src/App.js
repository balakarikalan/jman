import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import ListUserComponent from "../src/component/user/ListUserComponent";
import AddUserComponent from "../src/component/user/AddUserComponent";
import EditUserComponent from "../src/component/user/EditUserComponent";
function App() {
  return (
      <div className="container">
          <Router>
              <div className="col-md-6">
                  <h1 className="text-center" style={style}>React User Application</h1>
                  <Switch>
                      <Route exact path="/"  component={ListUserComponent} />
                      <Route path="/users" component={ListUserComponent} />
                      <Route path="/add-user" component={AddUserComponent} />
                      <Route path="/edit-user" component={EditUserComponent} />
                  </Switch>
              </div>
          </Router>
      </div>
  );
}

const style = {
    color: 'red',
    margin: '10px'
}

export default App;

// import React from 'react';

// import { BrowserRouter as Router, Route, Switch, Link } from 'react-router-dom';
// import './App.css';
// import ListUserComponent from "../src/component/user/ListUserComponent";
// import AddUserComponent from "../src/component/user/AddUserComponent";
// import EditUserComponent from "../src/component/user/EditUserComponent";


// const App = () => (
//   <Router>
//     <Switch>
//       <Route exact path="/" component={ListUserComponent} />
//       <Route path="/users" component={ListUserComponent} />
//       <Route path="/add-user" component={AddUserComponent} />
//       <Route path="/edit-user" component={EditUserComponent} />
//     </Switch>
//   </Router>
// )

// export default App;