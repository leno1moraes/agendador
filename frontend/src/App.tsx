import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import Menu from './components/Menu';
import Home from './pages/Home';
import FormRecord from './pages/FormRecord';

function App() {
  return (

    <>
      <Menu/>
      <Router>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path='/record' element={<FormRecord />} />
        </Routes>
      </Router>

    </>

  );
}

export default App;
