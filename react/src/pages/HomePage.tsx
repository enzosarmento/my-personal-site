import enzoAvatar from "../assets/images/enzo-avatar.png"

function HomePage() {
    return (
        <>
            <Apresentation/>
            <About />
        </>
    )
}

function Apresentation() {
    return(
        <div className="display">
            <img src={enzoAvatar} alt="pixelated avatar" className="size-45"></img>
            <section className="apresentation">
                <h1>Enzo Sarmento</h1>
                <p>
                    I'm a developer
                </p>
            </section>
        </div>
    )
}

function About() {

    const fileUrl = "../assets/"

    return(
        <section className="about">
            <h2 className="">ABOUT ME</h2>
            <p className="text-justify">
                I'm a developer, I love to code and I'm always looking for new challenges to learn and improve my skills.
            </p>
            <div className="text-center">
                <button className="button-red">
                        <a href="/cv.pdf" download="CV_Enzo_Fernandes_Sarmento.pdf">
                            DONWLOAD CV
                        </a>
                </button>
            </div>
        </section>
    )
}

export default HomePage