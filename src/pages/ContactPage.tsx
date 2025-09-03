import arrow from "../assets/images/arrow.png"

function ContactPage() {
    return (
        <>
            <section className="contacts">
                <h1>Contacts</h1>
                <ul>
                    <li>
                        <img src={arrow} className="contacts-arrow"  alt="arrow image"></img>
                        <a href="https://github.com/enzosarmento" target="_blank">
                            Github
                        </a>
                    </li>
                    <li>
                        <img src={arrow} className="contacts-arrow"  alt="arrow image"></img>
                        <a href="https://www.linkedin.com/in/enzo-fernandes-sarmento-846573208/" target="_blank">
                            Linkedin
                        </a>
                    </li>
                    <li>
                        <img src={arrow} className="contacts-arrow"  alt="arrow image"></img>
                        <a className="email" href="mailto:enzosarmento91@gmail.com" target="_blank" rel="noopener noreferrer">enzosarmento91@gmail.com</a>
                    </li>
                </ul>
            </section>
        </>
    )
}

export default ContactPage