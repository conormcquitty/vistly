'use client';

import { useState, useEffect } from 'react';

export default function Home() {
    const [isLoading, setLoading] = useState(true)
    const [userData, setUserData] = useState(null);

    useEffect(() => {
        const fetchUser = async () => {
            const response = await fetch('http://localhost:8080/api/v1/users');
            const data = await response.json();
            setUserData(data);
            setLoading(false);
        };

        fetchUser();
    }, []);

    if (isLoading) return <p>Loading...</p>

    return (
        <>
            <pre>{JSON.stringify(userData, null, 2)}</pre>
        </>
    );
}