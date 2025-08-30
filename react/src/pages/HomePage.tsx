import enzoAvatar from "../assets/enzo-avatar.png"

function HomePage() {
    return (
        <div className="home-page">
            <Apresentation/>
            <About />
        </div>
    )
}

function Apresentation() {
    return(
        <div className="display">
            <img src={enzoAvatar} alt="pixelated avatar" className="size-45"></img>
            <section>
                <h2>Enzo Sarmento</h2>
                <p>
                    I'm a developer
                </p>
            </section>
        </div>
    )
}

function About() {
    return(
        <section>
            <h2>ABOUT ME</h2>
            <p>
                I'm a developer, I love to code and I'm always looking for new challenges to learn and improve my skills.
            </p>
        </section>
    )
}

export default HomePage