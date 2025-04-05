import { Suspense } from 'react';
import LoginForm from "@/src/app/ui/login-form";
import {signOut} from "@/auth";

export default function LoginPage() {
    return (
        <main className="flex items-center justify-center md:h-screen">
            <div className="relative mx-auto flex w-full max-w-[400px] flex-col space-y-2.5 p-4 md:-mt-32">
                <div className="flex h-20 w-full items-end rounded-lg bg-blue-500 p-3 md:h-36">
                </div>
                <Suspense>
                    <LoginForm />
                </Suspense>
            </div>
            <form
                action={async () => {
                    'use server';
                    await signOut({ redirectTo: '/login' });
                }}
            >
                <button className="flex h-[48px] w-full grow items-center justify-center gap-2 rounded-md bg-gray-50 p-3 text-sm font-medium hover:bg-sky-100 hover:text-blue-600 md:flex-none md:justify-start md:p-2 md:px-3">
                    <div className="hidden md:block">Sign Out</div>
                </button>
            </form>
        </main>
    );
}