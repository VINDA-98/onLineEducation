package top.weidaboy.eduservice.service;

import top.weidaboy.eduservice.entity.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author vinda
 * @since 2020-09-28
 */
public interface EduVideoService extends IService<EduVideo> {
    //1 根据课程id删除小节
    void removeVideoByCourseId(String courseId);
}
