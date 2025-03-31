import {UserCard} from "@/src/app/users/UserCard";

export default async function Home() {
    const response = await fetch('http://localhost:8080/api/v1/users');
    const users = await response.json();

    return (
        <>
            <div className="max-w-5xl flex flex-col gap-5">
                { users.map(user => <UserCard key={user.id} user={user}/>) }
            </div>
        </>
    );
}