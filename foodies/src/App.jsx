import React from 'react'
import Menubar from './components/Menubar/Menubar'
import Home from './pages/Home/Home.jsx'
import ExploreFood from './pages/Explore/ExploreFood.jsx'
import Contact from './pages/Contact/Contact.jsx'
import { Routes, Route } from 'react-router-dom';

const App = () => {
  return (
    <div>
      <Menubar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/contact" element={<Contact />} />
        <Route path="/explore" element={<ExploreFood />} />
      </Routes>
    </div>
  )
}

export default App