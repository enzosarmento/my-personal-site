import { useState } from "react";
import { Outlet, Link, useNavigate } from "react-router-dom";

function GameBoyLayout() {
    return (
        <div className="site flex-col">
            <div className="gameboy">
                <div className="line-horizontal"></div>
                <div className="p-6 game-boy-layout">
                        <main className="home-page">
                            <Outlet />
                        </main>
                    <nav>
                        <Link to="/">Home</Link>
                        <Link to="/projects">Projects</Link>
                        <Link to="/contacts">Contacts</Link>
                    </nav>
                    <section className="buttons">
                        <DPad />
                        <ButtonsAB />
                    </section>
                </div>
            </div>
            <nav>
                <p>
                    &copy; 2025 | Made with &#10084; Enzo Sarmento
                </p>
            </nav>
        </div>
    )
}

function DPad() {
    const navigate = useNavigate();
    const [page, setPage] = useState(0)
    const listPages = ['', "projects", "contacts"]

    const handleClick = (direction: 'next' | 'prev') => {
        const totalPages = listPages.length;
        let newPageIndex;

        if (direction === 'next') {
            newPageIndex = (page + 1) % totalPages;
        } else {
            newPageIndex = (page - 1 + totalPages) % totalPages;
        }
        
        setPage(newPageIndex);
        navigate(listPages[newPageIndex]);
    };

    return(
        <>
            <svg width="0" height="0" style={{ position: 'absolute' }}>
                <clipPath id="rounded-dpad-shape" clipPathUnits="objectBoundingBox">
                <path d="M0.33,0.05 Q0.33,0,0.4,0 H0.6 Q0.66,0,0.66,0.05 V0.33 H0.95 Q1,0.33,1,0.4 V0.6 Q1,0.66,0.95,0.66 H0.66 V0.95 Q0.66,1,0.6,1 H0.4 Q0.33,1,0.33,0.95 V0.66 H0.05 Q0,0.66,0,0.6 V0.4 Q0,0.33,0.05,0.33 H0.33 Z" />
                </clipPath>
            </svg>

            <div className="d-pad-container">
                <div className="d-pad">
                    <button onClick={() => handleClick("next")} className="d-pad-button up"></button>
                    <button onClick={() => handleClick("next")} className="d-pad-button right"></button>
                    <button onClick={() => handleClick("prev")} className="d-pad-button down"></button>
                    <button onClick={() => handleClick("prev")} className="d-pad-button left"></button>
                </div>
            </div>
        </>
    )
}

function ButtonsAB() {
    return (
        <div className="buttons-a-b">
            <button className="button-b">B</button>
            <button className="button-a">A</button>
        </div>
    )
}

export default GameBoyLayout
