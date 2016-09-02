package io.vaxly.sema.session;

import com.badoo.barf.data.repo.Repository;
import com.badoo.barf.usecase.UseCase;
import com.badoo.chateau.core.model.User;
import io.vaxly.sema.data.repos.session.SessionQuery;

import rx.Observable;

@UseCase
public class SignOut {

    private final Repository<? extends User> mRepository;

    public SignOut(Repository<? extends User> repository) {
        mRepository = repository;
    }

    public Observable<Void> execute() {
        return mRepository.query(new SessionQuery.SignOut());
    }
}
