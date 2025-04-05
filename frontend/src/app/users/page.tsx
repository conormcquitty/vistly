'use client';

import {useActionState, useEffect, useState} from "react";
import {signOut} from "@/auth";

export default function Home() {
    const [users, setUsers] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchUsers = async () => {
            try {
                setLoading(true);
                const response = await fetch('http://localhost:8080/api/v1/users');

                if (!response.ok) {
                    throw new Error(`HTTP error! Status: ${response.status}`);
                }

                const data = await response.json();
                setUsers(data);
                setError(null);
            } catch (err) {
                setError(err.message);
                setUsers([]);
            } finally {
                setLoading(false);
            }
        };

        fetchUsers();
    }, []);

    return (
        <>
            hi
            {/*<div className="max-w-5xl flex flex-col gap-5">*/}
            {/*    { users.map(user => <UserCard key={user.id} user={user}/>) }*/}
            {/*</div>*/}
        </>
    );
}