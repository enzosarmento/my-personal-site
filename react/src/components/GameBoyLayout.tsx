import { Outlet, Link } from "react-router-dom";

function GameBoyLayout() {
    return (
        <>
            <div className="line-horizontal"></div>
            <div className="line-vertical left"></div>
            <div className="line-vertical right"></div>
            <div className="game-boy-layout min-h-screen">

                <main className="">
                    <Outlet />
                </main>
                <ButtonsAB />
            </div>
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
