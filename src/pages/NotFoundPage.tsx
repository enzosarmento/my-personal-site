import { Link } from 'react-router-dom';

function NotFoundPage() {
    return (
        <div className='page-not-found'>
            <h1>404</h1>
            <h2>Oops! Page Not Found</h2>
            <p>The rout you tried to access doesn't exist.</p>
            <Link to="/" className='button-red'>
                Back to home
            </Link>
        </div>
    );
}

export default NotFoundPage;