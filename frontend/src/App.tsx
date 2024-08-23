import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import './App.css';
import Menu from './components/Menu';
import Home from './pages/Home';

import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (

    <>
      <Menu/>
      <Router>
        <Routes>
          <Route path="/" element={<Home/>}/>
        </Routes>
      </Router>

    </>

  );
}

export default App;
