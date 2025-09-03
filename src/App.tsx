import { Route, Routes } from 'react-router-dom'
import './index.css'
import HomePage from './pages/HomePage'
import ContactPage from './pages/ContactPage'
import GameBoyLayout from './components/GameBoyLayout'
import ProjectPage from './pages/ProjectPage'
import NotFoundPage from './pages/NotFoundPage'

function App() {
  return (
    <Routes>
      <Route path="/" element={<GameBoyLayout />}>
        <Route index element={<HomePage />} />
        <Route path='/projects' element={<ProjectPage />} />
        <Route path="/contacts" element={<ContactPage />} />

        <Route path='*' element={<NotFoundPage/>} />
      </Route>
    </Routes>
  )
}

export default App
