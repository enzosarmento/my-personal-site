import { Outlet, Link } from "react-router-dom";

function GameBoyLayout() {
    return (
        <>
            <GameBoyLines />
            <div className="p-6 game-boy-layout min-h-screen">
                    <main className="home-page">
                        <Outlet />
                    </main>
                <nav>
                    <Link to="/">Home</Link>
                    <Link to="/contact">Contact</Link>
                </nav>
                
                    <ButtonsAB />
            </div>
        </>
    )
}

function GameBoyLines() {
    return(
        <>
            <div className="line-horizontal"></div>
            <div className="line-vertical left"></div>
            <div className="line-vertical right"></div>
        </>
    )
}

function DPad() {
    return(
        <h1>
            TODO
        </h1>
    )
}

function ButtonsAB() {
    return (
        <h1>
            Button text
        </h1>
    )
}

export default GameBoyLayout
