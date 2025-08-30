import { Route, Routes } from 'react-router-dom'
import './index.css'
import HomePage from './pages/HomePage'
import ContactPage from './pages/ContactPage'
import GameBoyLayout from './components/GameBoyLayout'

function App() {
  return (
    <Routes>
      <Route path="/" element={<GameBoyLayout />}>
        <Route index element={<HomePage />} />
        <Route path="/contact" element={<ContactPage />} />
      </Route>
    </Routes>
  )
}

export default App
